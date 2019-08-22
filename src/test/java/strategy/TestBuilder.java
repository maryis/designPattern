package test.java.strategy;

import main.java.strategy.ContextClass;
import main.java.strategy.RarCompression;
import main.java.strategy.ZipCompression;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;

import java.io.File;
import java.io.IOException;

public class TestBuilder {

    @Rule
    public TestName testName=new TestName();

    @Rule
    public TemporaryFolder temporaryFolder=new TemporaryFolder();

    @Test
    public void testStrategy() throws IOException {

        File f=temporaryFolder.newFile();


        ContextClass context=new ContextClass(new ZipCompression());
        boolean res=context.archive(f);
        Assert.assertTrue("the file archived? ",res);

        context.setCompressStrategy(new RarCompression());
        res=context.archive(f);
        Assert.assertTrue("the file archived? ",res);

    }
}
