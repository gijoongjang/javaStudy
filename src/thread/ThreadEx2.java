package thread;

public class ThreadEx2 {

    static class ThreadEx2_1 extends Thread {
        @Override
        public void run() {
            throwException();
        }

        public void throwException() {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadEx2_1 thread1 = new ThreadEx2_1();
        thread1.start();
    }
}
