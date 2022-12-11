package structural.adapter;

/**
 * This is the target class that adaptee is going to be similar to it
 */
public interface Shape {
    void draw();

    boolean isHidden();

    void hide();
}
