package creational.builder;


import org.junit.Assert;
import org.junit.Test;

public class TestBuilder {

    @Test
    public void testBuilder(){
        User u1=new UserBuilder().setAge(12).setCompany("nioc").setName("ali").build();
        User u2=new User("ali", "",12,"nioc","");

        Assert.assertEquals("comparing two obj property:",u1.getAge(),u2.getAge());
        Assert.assertNotSame("comparing two obj :",u1,u2);



    }
}
