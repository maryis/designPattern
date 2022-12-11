package structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class TestClass {

    @Test
    public void testFlyWeight() {
        TreeType treeType1 = TreeFactory.getTreeType("x", Color.BLUE, "xxx");
        Tree tree1 = new Tree(1, 2, treeType1);
        Tree tree2 = new Tree(13, 22, treeType1);

        TreeType treeType2 = TreeFactory.getTreeType("y", Color.RED, "yyy");
        Tree tree11 = new Tree(1, 2, treeType2);
        Tree tree21 = new Tree(13, 22, treeType2);

        Assert.assertEquals(treeType1, tree1.getType());
        Assert.assertEquals(treeType1, tree2.getType());
        Assert.assertEquals(treeType2, tree11.getType());
        Assert.assertEquals(treeType2, tree21.getType());
    }
}
