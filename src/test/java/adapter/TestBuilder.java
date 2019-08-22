package test.java.adapter;

import main.java.adapter.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestBuilder {

    @Rule
    public TestName testName=new TestName();

    @Test
    public void testAdapter(){

        Drawing drawing=new Drawing();

        drawing.addShape(new Circle(12));
        drawing.addShape(new Circle(23));

        drawing.addShape(new GeoShapeAdapter(new GeoCircle()));

        drawing.drawAll();
    }
}
