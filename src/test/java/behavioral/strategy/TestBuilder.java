package behavioral.strategy;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;

public class TestBuilder {

    @Rule
    public TestName testName = new TestName();

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testStrategy() throws IOException {

        File f = temporaryFolder.newFile();
        ZipCompression zipCompression = Mockito.mock(ZipCompression.class);
        RarCompression rarCompression = Mockito.mock(RarCompression.class);

        ContextClass context = new ContextClass(zipCompression);
        boolean res = context.archive(f);
        Mockito.verify(zipCompression, Mockito.times(1)).compressFiles(f);
        Mockito.verify(rarCompression, Mockito.times(0)).compressFiles(f);

        context.setCompressStrategy(rarCompression);
        res = context.archive(f);
        Mockito.verify(rarCompression, Mockito.times(1)).compressFiles(f);
        Mockito.verify(zipCompression, Mockito.times(1)).compressFiles(f);

    }
}
