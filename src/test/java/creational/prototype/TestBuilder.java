package creational.prototype;

import org.junit.Assert;
import org.junit.Test;

public class TestBuilder {

    @Test
    public void testBuilder() {
        User u1 = CachedUsers.getUserByType("1");
        Assert.assertEquals("user1", u1.name);

        User u2 = CachedUsers.getUserByType("2");
        Assert.assertEquals("user2", u2.name);
    }
}
