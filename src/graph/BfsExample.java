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
        BfsExample be = new BfsExample(8);

        be.addNode(1,2);
        be.addNode(1,3);
        be.addNode(1,4);
        be.addNode(2,1);
        be.addNode(2,5);
        be.addNode(2,6);
        be.addNode(3,1);
        be.addNode(4,1);
        be.addNode(4,7);
        be.addNode(5,2);
        be.addNode(6,2);
        be.addNode(7,4);

        be.bfs(1);
    }
}
