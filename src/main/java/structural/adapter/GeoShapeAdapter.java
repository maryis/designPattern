package structural.adapter;

public class GeoShapeAdapter implements Shape { //object structural.adapter

    private GeoShape adaptee;

    public GeoShapeAdapter(GeoShape adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.locate();
    }

    @Override
    public boolean isHidden() {
        return  adaptee.isHidden();
    }

    @Override
    public void hide() {
        adaptee.relocate();
    }
}
