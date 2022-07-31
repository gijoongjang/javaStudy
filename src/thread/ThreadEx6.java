package thread;

public class ThreadEx6 {

    public static void main(String[] args) {
        ThreadEx6_1 thread1 = new ThreadEx6_1("*");
        ThreadEx6_1 thread2 = new ThreadEx6_1("**");
        ThreadEx6_1 thread3 = new ThreadEx6_1("***");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(2000);
            thread1.suspend();
            Thread.sleep(2000);
            thread2.suspend();
            Thread.sleep(3000);
            thread1.resume();
            Thread.sleep(3000);
            thread1.stop();
            thread2.stop();
            Thread.sleep(2000);
            thread3.stop();
        } catch (InterruptedException e) {

        }
    }

    static class ThreadEx6_1 implements Runnable {
        boolean suspended = false;
        boolean stopped = false;
        Thread t;

        ThreadEx6_1(String name) {
            t = new Thread(this, name);
        }

        @Override
        public void run() {
            String threadName = t.getName();
            while(!stopped) {
                if(!suspended) {
                    System.out.println(threadName);
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(threadName + " - interrupted");
                    }
                } else {
                    Thread.yield(); //busy waiting x
                }
            }

            System.out.println(threadName + " - stopped");
        }

        public void suspend() {
            suspended = true;
            t.interrupt();
            System.out.println(t.getName() + " - interrupt() by suspend()");
        }

        public void stop() {
            stopped = true;
            t.interrupt();
            System.out.println(t.getName() + " - interrupt() by stop()");
        }

        public void resume() {
            suspended = false;
        }

        public void start() {
            t.start();
        }
    }
}
