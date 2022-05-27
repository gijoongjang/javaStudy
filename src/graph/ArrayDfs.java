package graph;

public class ArrayDfs {
    private boolean[] checked = new boolean[9];
    private int[][] graph = {{}, {2,3,7}, {1,5,7}, {1,6}, {6,8}, {2}, {3,4,8}, {1,2}, {4,6}};

    public void dfs(int start) {
        checked[start] = true;
        System.out.print(start + " ");
        for (int node : graph[start]) {
            if(!checked[node]) {
                dfs(node);
            }
        }
    }

    public static void main(String[] args) {
        new ArrayDfs().dfs(1);
    }
}
