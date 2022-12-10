package creational.abstractfactory;


//!!!!!!!!!!!!!!!!!!!!!!!!!!1
//incomplete, I have to add Factoryprovider with static method getFactory
public interface AbstractFactory<T> {

    T create(String type);
}
