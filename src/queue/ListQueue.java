package queue;

public class ListQueue<T> {

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;

    private boolean isEmpty() {
        return head == null;
    }

    public T add(T item) {
        Node<T> node = new Node<T>(item);

        if (isEmpty())
            head = node;

        head.next = node;

        return node.data;
    }

    public T remove() {
        if (isEmpty())
            throw new RuntimeException();

        T data = head.data;
        head = head.next;

        return data;
    }

    public T peek() {
        if (isEmpty())
            throw new RuntimeException();

        return head.data;
    }

    public void print() {
        Node<T> node = head;

        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListQueue<String> queue = new ListQueue<>();

        queue.add("A");
        queue.add("B");
        queue.print();
        System.out.println("front : " + queue.peek());

        queue.remove();
        queue.print();
    }
}
