package structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * The client class, an example how we use adapter pattern
 */
public class Drawing {

    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public void drawAll() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
