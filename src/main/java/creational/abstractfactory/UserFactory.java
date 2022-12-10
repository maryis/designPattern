package creational.abstractfactory;

public class UserFactory implements AbstractFactory<User> {


    @Override
    public User create(String type) {
        return new User();
    }
}
