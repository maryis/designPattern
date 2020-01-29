package structural.flyweight;

import org.junit.Test;

import java.awt.*;

public class TestClass {

    @Test
    public void testFlyWeight(){

        //need 5 tree of type x:
        TreeType treeTypex=TreeFactory.getTreeType("x", Color.BLUE,"xxx");
        Tree tree1=new Tree(1,2,treeTypex);
        Tree tree2=new Tree(13,22,treeTypex);
        Tree tree3=new Tree(12,21,treeTypex);
        Tree tree4=new Tree(21,6,treeTypex);


        TreeType treeTypey=TreeFactory.getTreeType("y", Color.RED,"yyy");
        Tree tree11=new Tree(1,2,treeTypey);
        Tree tree21=new Tree(13,22,treeTypey);
        Tree tree31=new Tree(12,21,treeTypey);
        Tree tree41=new Tree(21,6,treeTypey);



    }
}
