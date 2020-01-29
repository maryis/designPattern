package behavioral.strategy;

import java.io.File;

public class ZipCompression implements CompressStrategy {
    @Override
    public void compressFiles(File f) {
        System.out.println("compress file with zip");
        System.out.println(f.getPath()+" "+f.getName());


    }
}
