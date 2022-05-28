package graph;

public class DfsAdjMatrixExample {
    private int[][] arr;
    private boolean[] checked;

    public DfsAdjMatrixExample(int size) {
        arr = new int[size+1][size+1];
        checked = new boolean[size+1];
    }

    public void addNode(int from, int to) {
        arr[from][to] = 1;
    }

    public void dfs(int start) {
        checked[start] = true;
        System.out.print(start + " ");
        for(int i =0; i < arr.length; i++) {
            if( ( !checked[i] ) && ( arr[start][i] == 1 ) ) {
                dfs(i);
            }
        }
    }

    public void printGraph() {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        DfsAdjMatrixExample dame = new 	DfsAdjMatrixExample(9);

        dame.addNode(1,2);
        dame.addNode(1,3);
        dame.addNode(1,7);
        dame.addNode(2,1);
        dame.addNode(2,5);
        dame.addNode(2,7);
        dame.addNode(3,1);
        dame.addNode(3,6);
        dame.addNode(4,6);
        dame.addNode(4,8);
        dame.addNode(5,2);
        dame.addNode(6,3);
        dame.addNode(6,4);
        dame.addNode(6,8);
        dame.addNode(7,1);
        dame.addNode(7,2);
        dame.addNode(8,4);
        dame.addNode(8,6);

        System.out.print(" ");

        dame.dfs(1);

        System.out.println();
        System.out.println("------------------------");

        dame.printGraph();
    }
}

