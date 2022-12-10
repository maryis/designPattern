package creational.factory;

public class PersonFactory {

    public static Person getPerson(String type){
        if (type.equalsIgnoreCase("user")) {

            return new User("ali","sdf",34,"","");
        }
           if (type.equalsIgnoreCase("admin")) {

            return new Admin("ali","sdf");
        }
           return null;

    }
}
