package test.java.proxy;


import main.java.prototype.User;
import org.junit.Assert;
import org.junit.Test;

public class TestBuilder {

    @Test
    public void testBuilder(){
        User u1=new User("ali","asda",12,"","");

        User u2= (User) u1.clone();

        Assert.assertNotEquals("compairing two obj properties:",u1.getAge(),u2.getAge());
        Assert.assertEquals("compairing two obj :",u1,u2);


    }
}
