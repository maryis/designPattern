package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CachedUsers {
    private static final Map<String,User> map = new HashMap<>();

    //eager cache warm-up
    static {
        map.put("1", new UserImp1("user1", "sad", 23, "sd", "123"));
        map.put("2", new UserImp1("user2", "sad", 23, "sd", "456"));
    }

    public static User getUserByType(String type) {
        if(!map.containsKey(type))
                throw new RuntimeException("Wrong input parameters");
        return (User) map.get(type).clone();
    }

}
