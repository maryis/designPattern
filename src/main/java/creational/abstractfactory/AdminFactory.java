package creational.abstractfactory;

public class AdminFactory implements AbstractFactory<Admin> {

    @Override
    public Admin create(String type) {
        return new Admin();
    }
}
