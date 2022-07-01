package array;

import java.util.Scanner;

public class BOJ_2920EX {

    public void execute() {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[8];

        for(int i=0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        String result = "";
        for(int i = 0; i < n.length-1; i++) {
            if(n[i] == n[i+1]-1) {
                result = "ascending";
            } else if(n[i] == n[i+1]+1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        new BOJ_2920EX().execute();
    }

}
