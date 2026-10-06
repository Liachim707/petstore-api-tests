package api.controllers;

import api.models.Store;

import static io.restassured.RestAssured.given;

public class StoreController {

    public Store createOrder(Store order) {
        return given()
                .contentType("application/json")
                .body(order)
                .when()
                .post("/store/order")
                .then()
                .statusCode(200)
                .extract()
                .as(Store.class);
    }

    public Store getOrder(long id) {
        return given()
                .when()
                .get("/store/order/" + id)
                .then()
                .statusCode(200)
                .extract()
                .as(Store.class);
    }

    public void deleteOrder(long id) {
        given()
                .when()
                .delete("/store/order/" + id)
                .then()
                .statusCode(200);
    }
}
