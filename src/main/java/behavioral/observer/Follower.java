package behavioral.observer;

public class Follower implements Observer {
    private String name;
    private String state;

    public Follower(String name) {
        this.name = name;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String newState) {
        this.state = newState;
        System.out.println("update follower pages:" + name);
    }
}
