import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add ("Asia");
        ll.add ("North America");
        ll.add ("South America");
        ll.add ("Africa");
        ll.addFirst ("Europe");
        ll.add (1,"Australia");
        ll.add (2,"Antarctica");
        System.out.println ("Elements in Linked List is : " + ll);
        System.out.println ("Size of the Linked List is : " + ll.size() );
        usingIterator(ll);
    }

    private static void usingIterator(LinkedList<String> ll) {
        Iterator iterator = ll.iterator();
        while (iterator.hasNext()) {
            String object = (String) iterator.next();
            System.out.println(object);

        }
    }
}
