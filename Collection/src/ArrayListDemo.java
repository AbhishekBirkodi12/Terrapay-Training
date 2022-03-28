import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<>();
        al.add("Asia");
        al.add("North America");
        al.add("South America");
        al.add("Africa");
        al.add("Europe");
        al.add(1,"Australia");
        al.add(2,"Antarctica");
        System.out.println("Size of the ArrayList is:"+al.size());
        System.out.println("\nRetrieving elements in ArrayList using Iterator:");
        Iterator it=al.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+"\t");
        }

    }
}
