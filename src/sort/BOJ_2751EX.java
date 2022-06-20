package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 2751 수 정렬하기 2
 * 시간복잡도 -> O(nlogn)
 * Collections.sort() 이용 -> Tim Sort
 */
public class BOJ_2751EX {

    public void execute() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(int num : list) {
            sb.append(num).append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) {
        new BOJ_2751EX().execute();
    }
}
