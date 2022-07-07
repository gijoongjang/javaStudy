package hashtable;

import java.security.MessageDigest;
import java.util.Scanner;

public class BOJ_10930EX {

    public void execute() throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(s.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : md.digest()) {
            sb.append(String.format("%02x", b));
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        new BOJ_10930EX().execute();
    }
}
