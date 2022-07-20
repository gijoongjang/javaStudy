package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for(int i = 1; i < 11; i++) {
            map.put(i, String.format("test%s", Integer.toString(i)));
        }

        System.out.println("get(1) : " + map.get(1));
        System.out.println("remove(3) : " + map.remove(3));
        System.out.println("isEmpty : " + map.isEmpty());

        System.out.println("------key------");
        Set<Integer> keys = map.keySet();
        for(int key : keys) {
            System.out.println("key : " + key);
        }

        System.out.println("------value------");
        Collection<String> values = map.values();
        for(Object value : values) {
            System.out.println("value : " + value.toString());
        }

        System.out.println("------key : value------");
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
