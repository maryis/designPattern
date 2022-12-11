package structural.flyweight;
import java.awt.*;

public class Tree {
    private int x;
    private int y;
    // we dont create separate type for each tree
    // we use current ones if it already exists
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }

    public TreeType getType() {
        return type;
    }
}
