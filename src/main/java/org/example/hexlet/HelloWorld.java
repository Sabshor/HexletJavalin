package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
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
}
