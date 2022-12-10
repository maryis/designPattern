package creational.factory;

import org.junit.Assert;
import org.junit.Test;

public class TestBuilder {

    @Test
    public void testBuilder(){

        Person u1=  PersonFactory.getPerson("user");
        Person a1= PersonFactory.getPerson("admin");

        Assert.assertNotEquals("comparing two obj property:",u1.commonMethod(),a1.commonMethod());
        Assert.assertNotSame("comparing two obj :",u1,a1);



    }
}
