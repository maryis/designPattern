package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    private List<Shape> list=new ArrayList<>();

    public void addSahpe(Shape s){
        list.add(s);
    }
}
