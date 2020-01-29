package creational.prototype;

import org.junit.Assert;
import org.junit.Test;

public class TestBuilder {

    @Test
    public void testBuilder() throws CloneNotSupportedException {

      User u1=new User("ali","sfs",12,"","");
      User u2= (User) u1.clone();

        Assert.assertNotEquals("comparing two cloned obj",u1,u2);
        Assert.assertEquals("comparing two cloned obj att",u1.getName(),u2.getName());


    }
}
