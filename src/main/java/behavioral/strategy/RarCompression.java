package behavioral.strategy;

import java.io.File;

public class RarCompression implements CompressStrategy {

    @Override
    public void compressFiles(File f) {
        System.out.println("compress file with rar");
        System.out.println(f.getPath() + " " + f.getName());
    }
}
