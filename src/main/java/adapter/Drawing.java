package main.java.adapter;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

    List<Shape> shapes=new ArrayList<>();

    public void addShape(Shape s){
        shapes.add(s);
    }

    public void drawAll(){
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
