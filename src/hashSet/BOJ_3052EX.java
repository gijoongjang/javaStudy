package hashSet;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 백준 3052
 * 배열이 아닌 HashSet 이용
 */
public class BOJ_3052EX {

    public void execute() {
        Scanner s = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < 10; i++) {
            set.add(s.nextInt() % 42);
        }

        System.out.print(set.size());
    }

    public static void main(String[] args) {
       new BOJ_3052EX().execute();
    }
}
