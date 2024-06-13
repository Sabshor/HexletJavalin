package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.WelcomePage;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.users.UserPage;
import org.example.hexlet.dto.users.UsersPage;
import org.example.hexlet.model.Course;
import org.example.hexlet.model.User;

import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    private static final List<User> USERS = Data.getUsers();

    public static void main(String[] args) {
        //helloWorld();
        initTemplate();
    }

    private static void helloWorld() {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        // Описываем, что загрузится по адресу /
        app.get("/", ctx -> ctx.result("Hello World"));

        app.get("/users", ctx -> ctx.result("GET /users"));
        app.get("/hello", ctx -> {
            var name = ctx.queryParamAsClass("name", String.class).getOrDefault("World");
            ctx.result(String.format("Hello, %s!", name));
        });
        // динамические адреса
        app.get("users/{id}/post/{postId}", ctx -> {
            var userId = ctx.pathParam("id");
            var postId =  ctx.pathParam("postId");
            ctx.result("User ID: " + userId + " Post ID: " + postId);
        });

        app.post("/users", ctx -> ctx.result("POST /users"));

        app.start(7070); // Стартуем веб-сервер

        //Javalin app = Javalin.create().start(7000);
        //app.get("/", ctx -> ctx.result("Hello World!"));
    }

    private static void initTemplate() {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/", ctx -> {
            var page = new WelcomePage();
            ctx.render("index.jte", model("welcomePage", page));
        });

        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParam("id");
           // var course = /* Курс извлекается из базы данных. Как работать с базами данных мы разберем в следующих уроках */
            var course = new Course("Name_of_course", "description_of_course");
            course.setId(Long.valueOf(id));
            var page = new CoursePage(course);
            ctx.render("courses/show.jte", model("page", page));
        });

        app.get("/courses", ctx -> {
            var course1 = new Course("Name_of_course", "description_of_course");
            course1.setId(Long.valueOf(1));
            var course2 = new Course("course1", "descr1");
            course2.setId(Long.valueOf(2));
            var header = "Курсы по программированию";
            var page = new CoursesPage(List.of(course1, course2), header);
            ctx.render("courses/index.jte", model("page", page));
        });

        app.get("/users", ctx -> {
            var page = new UsersPage(USERS);
            ctx.render("users/index.jte", model("page", page));
        });

        app.get("/users/{id}", ctx -> {
            var id = ctx.pathParam("id");
            var user = USERS.stream()
                    .filter(u -> id.equals(String.valueOf(u.getId())))
                    .findFirst();
            if (user.isEmpty()) {
                throw new NotFoundResponse("User not found");
            }
            var page = new UserPage(user.get());
            ctx.render("users/show.jte", model("user", page));
        });

        app.start(7070);
    }
}
