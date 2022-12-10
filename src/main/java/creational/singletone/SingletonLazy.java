package creational.singletone;

public class SingletonLazy {
    //creating it here makes it thread safe
    private static SingletonLazy instance = null;

    private SingletonLazy(){}

    //we could have synchronized method, but limiting it to block is more efficient
    public static SingletonLazy getInstance(){
        if (instance == null)
            synchronized (SingletonLazy.class) {
                if(instance == null) instance = new SingletonLazy();
            }
        return instance;
    }

}
