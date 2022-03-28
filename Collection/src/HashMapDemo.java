import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>hm = new HashMap<Integer,String>();
        hm.put(new Integer(101),"Naresh");
        hm.put(new Integer(102),"Rajesh");
        hm.put(new Integer(103),"Suresh");
        hm.put(new Integer(104),"Mahesh");
        hm.put(new Integer(105),"Ramesh");
        Set<Integer>set = new HashSet<Integer>();
        set=hm.keySet();
        System.out.println(set);

        //to read values
        // to read value
        Collection<String> values = hm.values();
        for (Iterator iterator = values.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(string);
        }
        // over value and key
        System.out.println("--------over value and key------- ");
        Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> object = (Map.Entry<Integer, String>) iterator.next();
            System.out.println(object.getKey() + "," + object.getValue());
        }
    }
}
