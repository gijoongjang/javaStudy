package array;

import java.util.Scanner;

public class BOJ_2562EX {

    public void execute() {
        Scanner s = new Scanner(System.in);

        int max = 0;
        int index = 0;

        for (int i = 1; i <= 9; i++) {
            int n = s.nextInt();
            if(max < n) {
                max = n;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }

    public static void main(String[] args){
        new BOJ_2562EX().execute();
    }
}
