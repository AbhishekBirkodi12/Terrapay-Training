public class Theatre extends Thread{

    String str;
    Theatre(String str){
        this.str=str;
    }
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println(str+":"+i);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
class TDemo1{
    public static void main(String[] args) {
        Theatre obj1=new Theatre("Cut Ticket");
        Theatre obj2=new Theatre("Show Chair");
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}
