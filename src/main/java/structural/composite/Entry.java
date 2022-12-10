package structural.composite;

public interface Entry {

    void printPath();
    int getSize();
    void updatePath(String prefix);
    String absolutePath();
}
