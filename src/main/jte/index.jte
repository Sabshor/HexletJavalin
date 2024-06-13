@import org.example.hexlet.dto.WelcomePage
@param WelcomePage welcomePage

@template.layout.page(
    content = @`
        <p>Это главная страница ${WelcomePage.initTitle()}.</p>
    `,
    footer = @`
        <p>footer: <a href="${WelcomePage.initHrefProfile()}">GIT Profile</a></p>
    `
)