package graph;

import java.util.ArrayList;

/**
 * 인접리스트 이용한 DFS 구현
 * ex) [[], [2, 3, 7], [1, 5, 7], [1, 6], [6, 8], [2], [3, 4, 8], [1, 2], [4, 6]]
 */
public class DfsAdjListExample {
    private boolean[] checked;
    private ArrayList<ArrayList<Integer>> graph;

    public DfsAdjListExample(int size) {
        graph = new ArrayList<>();
        checked = new boolean[size+1];

        for(int i = 0; i < size; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addNode(int from, int to) {
        graph.get(from).add(to);
    }

    public void dfs(int start) {
        checked[start] = true;
        System.out.print(start + " ");
        for(int node : graph.get(start)) {
            if(!checked[node]){
                dfs(node);
            }
        }
    }

    public static void main(String[] args) {
        DfsAdjListExample dfsAdjListExample = new DfsAdjListExample(9);

        dfsAdjListExample.addNode(1,2);
        dfsAdjListExample.addNode(1,3);
        dfsAdjListExample.addNode(1,7);
        dfsAdjListExample.addNode(2,1);
        dfsAdjListExample.addNode(2,5);
        dfsAdjListExample.addNode(2,7);
        dfsAdjListExample.addNode(3,1);
        dfsAdjListExample.addNode(3,6);
        dfsAdjListExample.addNode(4,6);
        dfsAdjListExample.addNode(4,8);
        dfsAdjListExample.addNode(5,2);
        dfsAdjListExample.addNode(6,3);
        dfsAdjListExample.addNode(6,4);
        dfsAdjListExample.addNode(6,8);
        dfsAdjListExample.addNode(7,1);
        dfsAdjListExample.addNode(7,2);
        dfsAdjListExample.addNode(8,4);
        dfsAdjListExample.addNode(8,6);

        dfsAdjListExample.dfs(1);
    }
}
