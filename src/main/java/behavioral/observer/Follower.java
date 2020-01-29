package behavioral.observer;

public class Follower implements Observer{ //mess subscriber

    private String name;

    public Follower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     @Override
    public void update() {
        System.out.println("update follower pages:"+name);
    }
}
