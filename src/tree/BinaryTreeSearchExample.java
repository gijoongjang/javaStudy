package tree;

public class BinaryTreeSearchExample {

    static class Node {
        private int data;
        private Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void addNode(int data) {

        if (root == null) {
            root = new Node(data);
        } else {
            Node node = root;
            Node head;

            while(true) {
                head = node;

                if(node.data == data) {
                    System.out.println(String.format("%s 데이터 중복", data));
                    break;
                }

                if (data < head.data) {
                    node = head.left;

                    if (node == null) {
                        head.left = new Node(data);
                        break;
                    }
                } else {
                    node = head.right;

                    if (node == null) {
                        head.right = new Node(data);
                        break;
                    }
                }
            }
        }
    }

    /*
     * 전위순회
     * root - left - right
     */
    public void preOrder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /*
     * 중위순회
     * left - root - right
     */
    public void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    /*
     * 후위순회
     * left - right - root
     */
    public void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }


    public static void main(String[] args) {
        BinaryTreeSearchExample btse = new BinaryTreeSearchExample();

        btse.addNode(5);
        btse.addNode(1);
        btse.addNode(2);
        btse.addNode(6);
        btse.addNode(7);
        btse.addNode(10);
        btse.addNode(9);

        btse.preOrder(btse.root);
        System.out.println();

        btse.inOrder(btse.root);
        System.out.println();

        btse.postOrder(btse.root);
    }
}
