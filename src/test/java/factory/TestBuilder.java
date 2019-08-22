package test.java.factory;


import main.java.factory.Admin;
import main.java.factory.Person;
import main.java.factory.PersonFactory;
import main.java.factory.User;
import org.junit.Assert;
import org.junit.Test;

public class TestBuilder {

    @Test
    public void testBuilder(){

        PersonFactory factory=new PersonFactory();
        Person u1=  factory.getPerson("user");
        Person a1= factory.getPerson("admin");

        Assert.assertNotEquals("comparing two obj property:",u1.commonMethod(),a1.commonMethod());
        Assert.assertNotSame("comparing two obj :",u1,a1);



    }
}
