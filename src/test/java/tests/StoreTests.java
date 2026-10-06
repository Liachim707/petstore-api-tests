package tests;

import api.controllers.StoreController;
import api.models.Store;
import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StoreTests extends BaseTest {

    private final StoreController storeController =
            new StoreController();

    @Test
    void createOrderTest() {

        Store order = new Store(
                987654321L,
                123456789L,
                2,
                "placed"
        );

        Store response = storeController.createOrder(order);

        assertThat(response.getId())
                .isEqualTo(order.getId());

        assertThat(response.getPetId())
                .isEqualTo(order.getPetId());

        assertThat(response.getQuantity())
                .isEqualTo(2);

        assertThat(response.getStatus())
                .isEqualTo("placed");
    }

    @Test
    void deleteOrderTest() {

        Store order = new Store(
                987654320L,
                123456789L,
                1,
                "placed"
        );

        storeController.createOrder(order);

        storeController.deleteOrder(order.getId());
    }
}
