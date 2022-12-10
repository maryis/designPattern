package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Entry {

    private String name;
    private String path;
    private List<Entry> children;

    public Folder(String name, String path) {
        this.name = name;
        this.path = path;
        children=new ArrayList<>();
    }

    @Override
    public void printPath() {
        System.out.println(absolutePath());
        children.stream()
                .map(c->c.absolutePath())
                .forEach(System.out::println);
    }

    @Override
    public int getSize() {
        return children.stream()
                .map(f -> f.getSize())
                .reduce((s1, s2) -> s1+s2)
                .get();
    }

    @Override
    public void updatePath(String prefix) {
        this.path = prefix;
    }

    @Override
    public String absolutePath() {
        return (path.equals("/") ? "/" : path + "/") + name;
    }

    public void setPath(String path) { this.path = path; }

    public void addFile(Entry entry){
        entry.updatePath(absolutePath());
        children.add(entry);
    }

    public void removeFile(Entry entry){
        children.remove(entry);
    }
}
