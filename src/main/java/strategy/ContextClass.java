package main.java.strategy;

import java.io.File;

public class ContextClass {

    CompressStrategy compressStrategy;

    public ContextClass(CompressStrategy compressStrategy) {
        this.compressStrategy = compressStrategy;
    }

    public void setCompressStrategy(CompressStrategy compressStrategy) {
        this.compressStrategy = compressStrategy;
    }

    public boolean archive(File f){
        compressStrategy.compressFiles(f);
        return true;
    }
}
