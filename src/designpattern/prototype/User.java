package designpattern.prototype;

import java.util.*;

public class User implements Cloneable {

    private Map<String, Object> userNameAndAge;

    public User() {
        userNameAndAge = new HashMap<>();
    }

    public User(Map<String, Object> userNameAndAge) {
        this.userNameAndAge = userNameAndAge;
    }

    public void createUser() {
        userNameAndAge.put("장기중", 26);
        userNameAndAge.put("김기중", 25);
        userNameAndAge.put("이기중", 27);
    }

    public void createUser(Map<String, Object> userNameAndAge) {
        this.userNameAndAge = userNameAndAge;
    }

    public Map<String, Object> getUserMap() {
        return userNameAndAge;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Map<String, Object> map = new HashMap<>();

        userNameAndAge.forEach((key, value) -> {
            map.put(key, value);
        });

        return new User(map);
    }
}
