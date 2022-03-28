public class Reserve implements Runnable {
    int available = 1;
    int wanted;

    Reserve(int i) {
        wanted = i;
    }

    public void run() {
        synchronized (this) {
            System.out.println("Number of berths available:" + available);
            if (available >= wanted) {
                String name = Thread.currentThread().getName();
                System.out.println(wanted + " berths allotted to: " + name);
                try {
                    Thread.sleep(2000);
                    available = available - wanted;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Sorry, no berths available");
            }
        }
    }
}
class Safe{
    public static void main(String[] args) {
        Reserve obj=new Reserve(1);
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setName("First Person");
        t2.setName("Second Person");
        t1.start();
        t2.start();
    }
}
