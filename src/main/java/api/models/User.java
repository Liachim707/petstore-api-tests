package api.models;

public class User {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;

    public User() {
    }

    public User(Long id,
                String username,
                String firstName,
                String lastName,
                String email,
                String password,
                String phone) {

        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
}
