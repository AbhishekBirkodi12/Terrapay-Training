public class Quiz1 {
    public static void main(String[] args) {
      /*  B a=new A();
        a.m1();*/
        A a1=new A();
        a1.m1();
    }
}
class A extends B{
static void m1(){
   // super.m1();
    System.out.println("A1 m1");

}
}
class B{
   static void  m1(){
        System.out.println("B m1");
       throw new RuntimeException();

    }
}
