package structural.composite;

public class File implements Entry {
    private String name;
    private String path;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void printPath() {
        System.out.println(absolutePath());
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void updatePath(String prefix) {
        path = prefix;
    }

    @Override
    public String absolutePath() {
        return path + "/" + name;
    }
}
