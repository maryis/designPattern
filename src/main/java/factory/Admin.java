package main.java.factory;

public class Admin implements Person {
    String name;
    String family;

    public Admin(String name, String family) {
        this.name = name;
        this.family = family;
    }

    @Override
    public String commonMethod() {
        return "admin";
    }
}
