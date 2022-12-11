package behavioral.observer;

import org.junit.Assert;
import org.junit.Test;

public class TestBuilder {

    @Test
    public void testObserver(){
        Celebrity celebrity=new Celebrity("lily");

        Follower follower1=new Follower("marzieh");
        Friend friend1 = new Friend("esi");

        celebrity.register(follower1);
        celebrity.register(friend1);

        celebrity.setCurr_job("new job");
        Assert.assertEquals("new job", friend1.getState());
        Assert.assertEquals("new job", follower1.getState());

        celebrity.unregister(follower1);
        celebrity.setCurr_job("newer job");
        Assert.assertEquals("new job", follower1.getState());
        Assert.assertEquals("newer job", friend1.getState());
    }
}
