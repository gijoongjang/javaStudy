package array;

import java.util.Scanner;

public class BOJ_8958EX {

    public void execute() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            int num = 0;
            int sum = 0;
            char[] arr = s.next().toCharArray();
            for(char c : arr) {
                if(c == 'O') {
                    num++;
                    sum += num;
                } else {
                    num = 0;
                }
            }

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        new BOJ_8958EX().execute();
    }
}
