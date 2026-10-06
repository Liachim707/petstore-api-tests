package tests;

import api.controllers.PetController;
import api.models.Pet;
import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PetTests extends BaseTest {

    private final PetController petController = new PetController();

    @Test
    void createPetTest() {

        Pet pet = new Pet(
                123456789L,
                "Barsik",
                "available"
        );

        petController.createPet(pet);

        Pet createdPet = petController.getPet(pet.getId());

        assertThat(createdPet.getId())
                .isEqualTo(pet.getId());

        assertThat(createdPet.getName())
                .isEqualTo("Barsik");

        assertThat(createdPet.getStatus())
                .isEqualTo("available");
    }

    @Test
    void updatePetTest() {

        Pet pet = new Pet(
                123456788L,
                "Murzik",
                "available"
        );

        petController.createPet(pet);

        pet.setName("MurzikUpdated");
        pet.setStatus("sold");

        petController.updatePet(pet);

        Pet updatedPet = petController.getPet(pet.getId());

        assertThat(updatedPet.getName())
                .isEqualTo("MurzikUpdated");

        assertThat(updatedPet.getStatus())
                .isEqualTo("sold");
    }

    @Test
    void deletePetTest() {

        Pet pet = new Pet(
                123456787L,
                "DeleteMe",
                "available"
        );

        petController.createPet(pet);

        petController.deletePet(pet.getId());
    }
}
