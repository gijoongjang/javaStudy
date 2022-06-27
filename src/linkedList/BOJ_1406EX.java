package linkedList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BOJ_1406EX {

    public void execute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int n = Integer.parseInt(br.readLine());

        List<Character> list = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        ListIterator<Character> it = list.listIterator();
        while(it.hasNext()) {
            it.next();
        }

        for(int i = 0; i < n; i++) {
            String cmd = br.readLine();
            switch (cmd.charAt(0)) {
                case 'L':
                    if(it.hasPrevious()) it.previous();
                    break;
                case 'D':
                    if(it.hasNext()) it.next();
                    break;
                case 'B':
                    if(it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;
                case 'P':
                    char ch = cmd.charAt(2);
                    it.add(ch);
                    break;
            }
        }

        for(char c : list) {
            bw.write(c);
        }

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        new BOJ_1406EX().execute();
    }
}
