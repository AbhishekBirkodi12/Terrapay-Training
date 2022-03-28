import java.util.HashSet;
import java.util.Iterator;

public class Hs {
    public static void main(String[] args) {
        //create a HashSet to store Strings
        HashSet<String> hs = new HashSet<String> ();
//Store some String elements
        hs.add ("India");
        hs.add ("America");
        hs.add ("Japan");
        hs.add ("China");
        hs.add ("America");
//view the HashSet
        System.out.println ("HashSet = " + hs);
//add an Iterator to hs
        Iterator it = hs.iterator ();
//display element by element using Iterator
        System.out.println ("Elements Using Iterator: ");
        while (it.hasNext() )
        { String s = (String) it.next ();
            System.out.println(s);
        }
    }
}
