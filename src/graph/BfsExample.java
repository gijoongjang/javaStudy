package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsExample {
    private boolean[] checked;
    private ArrayList<ArrayList<Integer>> graph;

    public BfsExample(int size) {
        graph = new ArrayList<>();
        checked = new boolean[size+1];

        for(int i = 0; i < size; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addNode(int from, int to) {
        graph.get(from).add(to);
    }

    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        checked[start] = true;

        while(!queue.isEmpty()) {
            int front = queue.poll();
            System.out.print(front + " ");
            for(int node : graph.get(front)) {
                if(!checked[node]) {
                    queue.add(node);
                    checked[node] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        BfsExample bale = new BfsExample(8);

        bale.addNode(1,2);
        bale.addNode(1,3);
        bale.addNode(1,4);
        bale.addNode(2,1);
        bale.addNode(2,5);
        bale.addNode(2,6);
        bale.addNode(3,1);
        bale.addNode(4,1);
        bale.addNode(4,7);
        bale.addNode(5,2);
        bale.addNode(6,2);
        bale.addNode(7,4);

        bale.bfs(1);
    }
}
