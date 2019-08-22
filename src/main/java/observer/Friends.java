package main.java.observer;

public class Friends implements Observer{

    private String name;

    public String getName() {
        return name;
    }

    public Friends(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("update friend pages:"+name);
    }
}
