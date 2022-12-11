package behavioral.observer;

public class Friend implements Observer {
    private String name;
    private String state;

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public Friend(String name) {
        this.name = name;
    }

    @Override
    public void update(String newState) {
        this.state = newState;
        System.out.println("update friend pages:" + name);
    }
}
