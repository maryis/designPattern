package creational.singletone;

public class Singletone {
    // make constructor private
    // a static method to return the only obj
    // make a private obj

    private static  Singletone singletone=null;

    private Singletone(){}

    public static Singletone getInstance(){
        if(singletone==null)
            singletone=new Singletone();

        return singletone;

    }

}
