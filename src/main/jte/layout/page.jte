@import gg.jte.Content
@import org.example.hexlet.dto.WelcomePage
@param Content content
@param Content footer = null

<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
          crossorigin="anonymous">
    <title>${WelcomePage.initTitle()}</title>
</head>
<body>
    <div class="mx-auto p-4 py-md-5">
        <main>
            <p>ниже данные из layout:</p>
            <h1 class="text-body-emphasis">${WelcomePage.initTitle()}</h1>
            <p><a href="/">Вернуться на главную</a></p>
            <div class="content">
                ${content}
            </div>

            <p></p>
            <p><a href="/users">Пользователи</a></p>
            <p><a href="/courses">Курсы</a></p>

            @if (footer != null)
                <div class="footer">
                    ${footer}
                </div>
            @endif
        </main>
    </div>
</body>
</html>
