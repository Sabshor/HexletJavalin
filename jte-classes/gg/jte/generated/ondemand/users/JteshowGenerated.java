package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.users.UserPage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "users/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,13,13,13,13,14,14,14,15,15,15,21,21,21,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPage user) {
		jteOutput.writeContent("\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\" />\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n    <title>пользователь</title>\n</head>\n<body>\n<div class=\"col-lg-8 mx-auto p-4 py-md-5\">\n    <main>\n        <h1>Иныормация о пользователе</h1>\n        <p>");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(user.getUser().getFirstName());
		jteOutput.writeContent("</p>\n        <p>");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(user.getUser().getLastName());
		jteOutput.writeContent("</p>\n        <p>");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(user.getUser().getEmail());
		jteOutput.writeContent("</p>\n    </main>\n</div>\n</body>\n</html>\n\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserPage user = (UserPage)params.get("user");
		render(jteOutput, jteHtmlInterceptor, user);
	}
}
