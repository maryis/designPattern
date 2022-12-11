package structural.adapter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestBuilder {
    @Rule
    public TestName testName=new TestName();

    @Test
    public void testAdapter(){
        Drawing drawing=new Drawing();
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(12);
        GeoCircle geoCircle = new GeoCircle();

        drawing.addShape(circle1);
        drawing.addShape(circle2);
        drawing.addShape(new GeoShapeAdapter(geoCircle));

        drawing.drawAll();
    }
}
