package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
import org.example.hexlet.dto.WelcomePage;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,13,13,13,13,19,19,19,22,22,22,29,29,31,31,31,33,33,38,38,38,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content, Content footer) {
		jteOutput.writeContent("\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\" />\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\n          rel=\"stylesheet\"\n          integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\n          crossorigin=\"anonymous\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WelcomePage.initTitle());
		jteOutput.writeContent("</title>\n</head>\n<body>\n    <div class=\"mx-auto p-4 py-md-5\">\n        <main>\n            <p>ниже данные из layout:</p>\n            <h1 class=\"text-body-emphasis\">");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(WelcomePage.initTitle());
		jteOutput.writeContent("</h1>\n            <p><a href=\"/\">Вернуться на главную</a></p>\n            <div class=\"content\">\n                ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n            </div>\n\n            <p></p>\n            <p><a href=\"/users\">Пользователи</a></p>\n            <p><a href=\"/courses\">Курсы</a></p>\n\n            ");
		if (footer != null) {
			jteOutput.writeContent("\n                <div class=\"footer\">\n                    ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(footer);
			jteOutput.writeContent("\n                </div>\n            ");
		}
		jteOutput.writeContent("\n        </main>\n    </div>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		Content footer = (Content)params.getOrDefault("footer", null);
		render(jteOutput, jteHtmlInterceptor, content, footer);
	}
}
