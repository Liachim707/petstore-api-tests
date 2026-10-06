package api.controllers;

import api.models.User;

import static io.restassured.RestAssured.given;

public class UserController {

    public User createUser(User user) {
        return given()
                .contentType("application/json")
                .body(user)
                .when()
                .post("/user")
                .then()
                .statusCode(200)
                .extract()
                .as(User.class);
    }

    public User getUser(String username) {
        return given()
                .when()
                .get("/user/" + username)
                .then()
                .statusCode(200)
                .extract()
                .as(User.class);
    }

    public void updateUser(String username, User user) {
        given()
                .contentType("application/json")
                .body(user)
                .when()
                .put("/user/" + username)
                .then()
                .statusCode(200);
    }

    public void deleteUser(String username) {
        given()
                .when()
                .delete("/user/" + username)
                .then()
                .statusCode(200);
    }
}
