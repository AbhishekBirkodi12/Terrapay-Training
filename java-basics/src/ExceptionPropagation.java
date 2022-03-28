public class ExceptionPropagation {
    public static void main(String[] args) {
        A1 a1=new A1();
        a1.m1();
    }

}
class A1{
  B1 b=new B1();
    void m1(){
        System.out.println("m1");
        try {
            b.m2();
        } catch (Exception e) {
            System.out.println("handled");
        }
    }

}

class B1{

    void m2(){
        System.out.println("m2");
        int a=1/0;
    }

}

