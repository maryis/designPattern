package structural.composite;

import org.junit.Test;

public class TestBuilder {
    @Test
    public void compositeDemo(){
        Folder doc=new Folder("doc1","/");
        Entry f1=new File("f1",10);
        Entry f2=new File("f2",12);
        Entry f3=new File("f3",14);
        doc.addFile(f1);
        doc.addFile(f2);
        doc.addFile(f3);

        doc.printPath();
    }
}
