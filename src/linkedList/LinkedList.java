package linkedList;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = new Node();
        this.size = 0;
    }

    private void add(Object data) {
        Node node = head;
        Node newNode = new Node();
        newNode.data = data;

        while(node.nextNode != null) {
            node = node.nextNode;
        }
        node.nextNode = newNode;
        size++;
    }

    private void remove(Object data) {
        Node node = head;

        while(node.nextNode != null) {
            if(node.nextNode.data == data) {
                node.nextNode = node.nextNode.nextNode;
                size--;
                break;
            }
            node = node.nextNode;
        }
    }

    private boolean contains(Object data) {
        Node node = head;

        while(node != null) {
            if(node.data == data) {
                return true;
            }
            node = node.nextNode;
        }

        return false;
    }

    private void showList() {
        Node node = head.nextNode;

        while(node.nextNode != null) {
            System.out.print(node.data + ",");
            node = node.nextNode;
        }

        System.out.println(node.data);
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        list.add("1");
        list.add("2");
        list.add("3");

        list.showList();
        System.out.println("contains : " + list.contains("3"));

        list.remove("3");
        list.remove("2");

        list.showList();
        System.out.println("contains : " + list.contains("3"));

    }
}
