package designpattern.prototype;

import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        User userA = new User();
        userA.createUser();

        User userB = (User) userA.clone();
        User userC = (User) userA.clone();

        Map<String, Object> map1 = userB.getUserMap();
        map1.put("장기상", 28);

        Map<String, Object> map2 = userC.getUserMap();
        map2.remove("이기중");

        System.out.println("---------userA---------");
        userA.getUserMap().entrySet().forEach(e -> System.out.println("이름 : " + e.getKey() + ", " + "나이 : " + e.getValue()));
        System.out.println("---------userB---------");
        map1.entrySet().forEach(e -> System.out.println("이름 : " + e.getKey() + ", " + "나이 : " + e.getValue()));
        System.out.println("---------userC---------");
        map2.entrySet().forEach(e -> System.out.println("이름 : " + e.getKey() + ", " + "나이 : " + e.getValue()));
    }
}
