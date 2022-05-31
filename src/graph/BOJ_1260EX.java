package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1260EX {
    private boolean[] checkedDfs;
    private boolean[] checkedBfs;
    private ArrayList<ArrayList<Integer>> graph;

    private StringBuilder sb;

    public void dfs(int start) {
        checkedDfs[start] = true;
        sb.append(start + " ");
        for(int node : graph.get(start)) {
            if(!checkedDfs[node]) {
                dfs(node);
            }
        }
    }

    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        checkedBfs[start] = true;

        while(!queue.isEmpty()) {
            int front = queue.poll();
            sb.append(front + " ");
            for(int node : graph.get(front)) {
                if(!checkedBfs[node]) {
                    queue.add(node);
                    checkedBfs[node] = true;
                }
            }
        }
    }

    public void execute() throws Exception{
        int n, m, v;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();
        graph = new ArrayList<>();
        checkedDfs = new boolean[n+1];
        checkedBfs = new boolean[n+1];

        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 0; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(v);
        sb.append("\n");
        bfs(v);

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception{
        new BOJ_1260EX().execute();
    }
}
