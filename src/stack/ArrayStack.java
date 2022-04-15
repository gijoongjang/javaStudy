package stack;

import java.util.EmptyStackException;

public class ArrayStack {
    private int top;
    private int maxSize;
    private Object[] stackArray;

    public ArrayStack(int maxSize) {
        top = -1;
        this.maxSize = maxSize;
        stackArray = new Object[maxSize];
    }

    /**
     * Stack이 비어있는지 체크
     * @return boolean (if stack empty ? true : false)
     */
    private boolean isEmpty() {
        return top == -1;
    }

    /**
     * Stack에 객체를 삽입
     * @param data
     */
    public void push(Object data) {
        stackArray[++top] = data;
    }

    /**
     * Stack의 맨 위에 객체 꺼냄
     * @return Object
     */
    public Object pop() {
        if(isEmpty()) {
            System.out.println("꺼낼 데이터 없음!!!");
            throw new EmptyStackException();
        }

        Object data = stackArray[top--];

        return data;
    }

    /**
     * Stack에 맨 위에 저장된 객체 반환
     * @return Object
     */
    public Object peek() {
        if(isEmpty()) {
            System.out.println("데이터 없음!!!");
            throw new EmptyStackException();
        }

        return stackArray[top];
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("스택 비어있음");
        }

        for(int i = top; i >= 0; i--) {
            System.out.println(String.format("%s번째 data : %s", i+1, stackArray[i]));
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.print();

        //stack.peek();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.print();
        System.out.println("top : " + stack.peek());

        stack.pop();
        stack.pop();
        stack.print();

        stack.pop();
        stack.print();
    }
}
