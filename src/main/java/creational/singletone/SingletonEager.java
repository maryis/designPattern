package creational.singletone;

public class SingletonEager {
    // make constructor private
    // a static method to return the only obj
    // make a private obj

    //creating it here makes it thread safe
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return INSTANCE;
    }

}
