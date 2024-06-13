package org.example.hexlet.dto.users;

import org.example.hexlet.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

// BEGIN
@AllArgsConstructor
@Getter
public class UserPage {
    private User user;
}
// END
