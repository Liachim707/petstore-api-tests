package tests;

import api.controllers.UserController;
import api.models.User;
import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTests extends BaseTest {

    private final UserController userController =
            new UserController();

    @Test
    void createUserTest() {

        String username = "test_user_123";

        User user = new User(
                555555L,
                username,
                "Ivan",
                "Ivanov",
                "ivan@test.com",
                "password123",
                "+79999999999"
        );

        userController.createUser(user);

        User response = userController.getUser(username);

        assertThat(response.getUsername())
                .isEqualTo(username);
    }

    @Test
    void updateUserTest() {

        String username = "test_user_124";

        User user = new User(
                555556L,
                username,
                "Ivan",
                "Ivanov",
                "ivan@test.com",
                "password123",
                "+79999999999"
        );

        userController.createUser(user);

        User updatedUser = new User(
                555556L,
                username,
                "Petr",
                "Petrov",
                "petr@test.com",
                "newpassword",
                "+78888888888"
        );

        userController.updateUser(username, updatedUser);

        User response =
                userController.getUser(username);

        assertThat(response.getFirstName())
                .isEqualTo("Petr");

        assertThat(response.getLastName())
                .isEqualTo("Petrov");

        assertThat(response.getEmail())
                .isEqualTo("petr@test.com");
    }

    @Test
    void deleteUserTest() {

        String username = "test_user_125";

        User user = new User(
                555557L,
                username,
                "Test",
                "User",
                "test@test.com",
                "password",
                "123456789"
        );

        userController.createUser(user);

        userController.deleteUser(username);
    }
}
