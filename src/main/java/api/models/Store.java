package api.models;

public class Store {

    private Long id;
    private Long petId;
    private Integer quantity;
    private String status;

    public Store() {
    }

    public Store(Long id, Long petId, Integer quantity, String status) {
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
