package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet();

        for(int i = 1; i < 10; i++) {
            set.add(i);
        }

        System.out.println("Contains : " + set.contains(2));
        System.out.println("HshSet size : " + set.size());

        Iterator i = set.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() + " ");
        }

        set.remove(1);
        set.remove(3);

        System.out.println();

        System.out.println("Contains : " + set.contains(1));
        for(int n : set) {
            System.out.print(n + " ");
        }
    }
}
