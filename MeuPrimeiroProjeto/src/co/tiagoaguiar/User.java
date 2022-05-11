package co.tiagoaguiar;

public class User {

    // PROPRIEDADES (PRIVATE)
    private String firstName;
    private String lastName;

    // SETTER
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // GETTER
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
