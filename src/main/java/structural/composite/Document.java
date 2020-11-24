package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Document implements Entry{

    public enum Type{
        Directory,
        File
    }

    private String name;
    private String path;
    private Type type;
    private List<Entry> children;

    public Document(String name, String path,Type type) {
        this.name = name;
        this.path = path;
        children=new ArrayList<>();
        this.type=type;
    }

    @Override
    public void printPath() {
        System.out.println(path+"/"+name);

    }

    @Override
    public int getsize() {
        return children.stream().map(f->f.getsize()).reduce((s1,s2)->s1+s2).get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public void setPath(String path) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void setSize(int size) {

    }

    public void addFile(Entry entry){
        entry.setPath(path+"/"+name);
        children.add(entry);
    }

    public void removeFile(Entry entry){
        children.remove(entry);
    }
}
