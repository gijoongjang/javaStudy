import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void execute() throws Exception {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);

        System.out.print(arr[0] + " " + arr[arr.length-1]);
    }

    public static void main(String[] args) throws Exception {
        new Main().execute();
    }
}