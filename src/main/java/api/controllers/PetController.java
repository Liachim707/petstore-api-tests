package api.controllers;

import api.models.Pet;

import static io.restassured.RestAssured.given;

public class PetController {

    public void createPet(Pet pet) {
        given()
                .contentType("application/json")
                .body(pet)
                .when()
                .post("/pet")
                .then()
                .statusCode(200);
    }

    public Pet getPet(long id) {
        return given()
                .when()
                .get("/pet/" + id)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
    }

    public void updatePet(Pet pet) {
        given()
                .contentType("application/json")
                .body(pet)
                .when()
                .put("/pet")
                .then()
                .statusCode(200);
    }

    public void deletePet(long id) {
        given()
                .when()
                .delete("/pet/" + id)
                .then()
                .statusCode(200);
    }
}
