package thread;

public class ThreadEx5 implements Runnable {

    static boolean autoSave = false;

    public void autoSave() {
        System.out.println("파일이 자동 저장되었습니다.");
    }

    @Override
    public void run() {
        while(true) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(autoSave) {
                autoSave();
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx5());
        t.setDaemon(true);
        t.start();

        for(int i = 0; i <= 10; i++) {
            try{
                Thread.sleep(3*1000);
            } catch (InterruptedException e) {

            }

            System.out.println(i);

            if(i == 5)
                autoSave = true;
        }
    }
}
