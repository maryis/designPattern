package creational.abstractfactory;

public class Admin implements Person {
    String name;
    String family;

    @Override
    public String commonMethod() {
        return "admin";
    }
}
