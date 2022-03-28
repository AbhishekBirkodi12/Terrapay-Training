package day2;

public class StringDemo {
    public static void main(String[] args) {
        demo3();
        demo2();
        strinPoolDemo();
    }

    private static void strinPoolDemo() {
        String s1 = "TerraPay"; // string literal
        String s2 = new String("TerraPay");
        System.out.println(s1 == s2);
    }

    private static void demo2() {
        String s1 = "Ram";
        System.out.println(s1.hashCode());
//		s1 = s1.concat(" kumar");
        s1 = s1 + " Kumar" + ", bangalore";
        System.out.println(s1.hashCode());
    }

    private static void demo3() {
        StringBuilder s1 = new StringBuilder("Ram");
        System.out.println(s1.hashCode());
        s1.append(" kumar").append(" Kumar").append(", bangalore");
        System.out.println(s1.hashCode());
    }
}
