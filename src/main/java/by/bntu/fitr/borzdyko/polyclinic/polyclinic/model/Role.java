package by.bntu.fitr.borzdyko.polyclinic.polyclinic.model;

public enum Role {

    ADMIN("ROLE_ADMIN"), USER("ROLE_USER");

    private final String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
