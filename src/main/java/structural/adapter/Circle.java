package structural.adapter;


public class Circle  implements Shape {
    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void draw() {
        System.out.println("draw a circle with d: " + diameter);

    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public void hide() {
        System.out.println("the circle with d:" + diameter + " has been hidden");

    }
}
