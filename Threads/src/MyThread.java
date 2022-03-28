public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            sleep(5000);
            System.out.println(Thread.currentThread());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
