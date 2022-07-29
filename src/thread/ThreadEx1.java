package thread;

public class ThreadEx1 {
    public static class ThreadEx1_1 extends Thread {

        @Override
        public void run() {
            for(int i = 0; i < 10; i++) {
                System.out.println(getName());
            }
        }
    }

    public static class ThreadEx1_2 implements Runnable {

        @Override
        public void run() {
            for(int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        ThreadEx1_1 thread1 = new ThreadEx1_1();
        thread1.setName("Extends Thread");

        Runnable r = new ThreadEx1_2();
        Thread thread2 = new Thread(r);
        thread2.setName("Runnable Thread");

        thread1.start();
        thread2.start();
    }
}
