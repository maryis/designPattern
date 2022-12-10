package creational.abstractfactory;


import org.junit.Test;

public class TestBuilder {

    @Test
    public void testFactory(){
        AbstractFactory<Admin> abstractFactory= new AdminFactory();
        abstractFactory.create("admin");
    }
}
