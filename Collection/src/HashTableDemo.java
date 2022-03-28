import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String>ht=new Hashtable<Integer, String>();
        ht.put(new Integer(101),"Naresh");
        ht.put(new Integer(102),"Rajesh");
        ht.put(new Integer(103),"Suresh");
        ht.put(new Integer(104),"Mahesh");
        ht.put(new Integer(105),"Ramesh");
        Enumeration e=ht.keys();
        while (e.hasMoreElements()){
            Integer i1=(Integer) e.nextElement();
            System.out.println(i1+"\t"+ht.get(i1));
        }


    }
}
