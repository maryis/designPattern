package main.java.prototype;


public class Admin extends Person {
    private String name;
    private String family;

    public Admin(String name, String family) {
        loadFromDB();
        this.name = name;
        this.family = family;

    }

    public Admin() {
    }

    private void loadFromDB() {
        System.out.println("a heavy load. avoid repeating by prototype");
    }

    @Override
    public Person clone() {
        Admin a = new Admin();
        a.setName(name);
        a.setFamily(family);
        return a;
    }

}
