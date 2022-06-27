package designpattern.builder;

import java.util.Date;

public class Main {

    public static void main(String args[]) {
        Todo todo = new Todo.Builder(1)
                .title("test")
                .userName("장기중")
                .createdDate(new Date())
                .isCompleted(false)
                .build();

        System.out.print(todo);
    }
}
