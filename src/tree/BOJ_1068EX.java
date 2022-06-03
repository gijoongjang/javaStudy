package tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1068EX {

    private int root;
    private int leafCount;
    private int removeNode;
    private ArrayList<Integer>[] childNode;

    public void dfs(int start) {
        if(start == removeNode) return;

        if(childNode[start].size() == 0) {
            leafCount++;
            return;
        }

        for(int node : childNode[start]) {
            // 현재 노드가 삭제 노드일경우 => leaf노드
            if( ( childNode[start].size() == 1 ) && ( node == removeNode ) ){
                leafCount++;
                break;
            }

            dfs(node);
        }
    }

    public void execute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        childNode = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            childNode[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int parent = Integer.parseInt(st.nextToken());
            if(parent == -1) {
                root = i;
                continue;
            }

            childNode[parent].add(i);
        }

        removeNode = Integer.parseInt(br.readLine());

        dfs(root);

        System.out.println(leafCount);
    }

    public static void main(String[] args) throws Exception{
        new BOJ_1068EX().execute();
    }
}

