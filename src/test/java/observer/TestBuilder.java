package test.java.observer;

import main.java.observer.Celebrity;
import main.java.observer.Follower;
import main.java.observer.Observer;
import org.junit.Test;

public class TestBuilder {

    @Test
    public void testObserver(){

        Celebrity celebrity=new Celebrity("lily");

        Follower follower1=new Follower("marzieh");
        Follower follower2=new Follower("esi");

        celebrity.register(follower1);
        celebrity.register(follower2);

        celebrity.setCurr_job("new job");
        celebrity.unregister(follower1);
        celebrity.setCurr_job("newer job");






    }
}
