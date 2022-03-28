public class WrapperDemo {
    public static void main(String[] args) {
        demo1();
        demo2();


    }

    private static void demo2() {
        Float f1=new Float(1.0F);
        float f2= 1.0F;
        System.out.println(f1==f2);//f1 was converted to primitive datatype float
    }

    private static void demo1() {
        int a=1;//primitive
        Integer a1=new Integer(1);//a1 converted to primitive
        System.out.println(a==a1);

        Integer a2=new Integer(1);//wrapper object
        System.out.println(a1==a2);//different object
    }
}
