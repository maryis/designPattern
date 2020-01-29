package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Subject { //mess Publisher

    List<Observer> followers=new ArrayList();
    private String name;
    private String curr_job;

    public String getCurr_job() {
        return curr_job;
    }

    public void setCurr_job(String curr_job) {
        this.curr_job = curr_job;
        notifyAllSubscribers();

    }

    public String getName() {
        return name;
    }

    public Celebrity(String name) {
        this.name = name;
    }

    @Override
    public void register(Observer o) {
        followers.add(o);

    }

    @Override
    public void unregister(Observer o) {
        int idx=followers.indexOf(o);
        followers.remove(idx);
    }

    @Override
    public void notifyAllSubscribers() {
        followers.forEach(follower->{
            follower.update();

        });

    }
}
