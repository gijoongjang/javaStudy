package linkedList;

public class GenericLinkedList<T> {
    static class GenericNode<T> {
        private T data;
        private GenericNode next;

        public GenericNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private int size;
    private GenericNode<T> head;

    public GenericLinkedList() {
        head = null;
    }

    public int size() {
        return size;
    }

    public void add(T data) {
        GenericNode<T> newNode = new GenericNode<>(data);

        if(head == null) {
            head = newNode;
        } else {
            GenericNode<T> node = head;

            while(node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        size++;
    }

    public void remove(T data) {
        if(head == null) {
            System.out.println("데이터 없음!!");
            throw new IndexOutOfBoundsException();
        }

        if(head.data.equals(data)) {
            GenericNode<T> node = head;
            head = node.next;
            node = null;
            size--;
        } else {
            GenericNode<T> node = head.next;
            GenericNode<T> prev = head;
            while(node != null) {
                if(node.data.equals(data)) {
                    prev.next = node.next;
                    node = null;
                    size--;
                    break;
                }
                prev = node;
                node = node.next;
            }
        }
    }

    public boolean contains(T data) {
        GenericNode<T> node = head;

        while(node != null) {
            if(node.data == data) {
                return true;
            }
            node = node.next;
        }

        return false;
    }

    public void print() {
        GenericNode node = head;

        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GenericLinkedList<Integer> list1 = new GenericLinkedList<>();
        GenericLinkedList<String> list2 = new GenericLinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.print();
        System.out.println(list1.size());
        System.out.println("contains : " + list1.contains(3));
        System.out.println("contains : " + list1.contains(4));

        list1.remove(3);

        list1.print();
        System.out.println(list1.size());

        System.out.println("----------------------------");

        list2.add("a");
        list2.add("b");
        list2.add("c");

        list2.print();

        list2.remove("c");
        list2.print();
    }
}
