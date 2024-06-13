package org.example.hexlet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

//@AllArgsConstructor
//@Getter
public final class WelcomePage {
    /*private String title;
    private String hrefProfile;*/

    public static String initTitle() {
        return "Javalin + jte";
    }

    public static String initHrefProfile() {
        return "https://github.com/Sabshor/HexletJavalin.git";
    }
}
