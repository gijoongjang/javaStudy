package thread;

public class ThreadEx4 {

    public static void main(String[] args) {
        ThreadEx4_1 thread1 = new ThreadEx4_1();
        ThreadEx4_2 thread2 = new ThreadEx4_2();

        thread2.setPriority(7);

        System.out.println("Priority of thread1(-) :" + thread1.getPriority());
        System.out.println("Priority of thread2(-) :" + thread2.getPriority());

        thread1.start();
        thread2.start();
    }

    static class ThreadEx4_1 extends Thread {
        @Override
        public void run() {
            for(int i = 0; i < 300; i++) {
                System.out.println("-");
                for(int j = 0; j < 100000000; j++);
            }
        }
    }

    static class ThreadEx4_2 extends Thread {
        @Override
        public void run() {
            for(int i = 0; i < 300; i++) {
                System.out.println("|");
                for(int j = 0; j < 100000000; j++);
            }
        }
    }
}
