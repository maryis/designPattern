package structural.adapter;


public class GeoCircle implements GeoShape {


    @Override
    public void locate() {
        System.out.println("the shape is located");

    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public void relocate() {
        System.out.println("the shape is relocated");


    }
}
