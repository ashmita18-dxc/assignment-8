import java.util.*;

public class Problem_15_to_21{
    public static void main(String[] args){
    
        //problem 15
    TreeMap<Integer,String> treemap=new TreeMap<>();
    treemap.put(1,"apple");
    treemap.put(2,"banana");
    treemap.put(3,"orange");
    treemap.put(4,"guava");
    treemap.put(5,"grapes");
    treemap.put(6,"mango");
    for (Map.Entry<Integer,String> entry : treemap.entrySet())
        {
            System.out.println(entry.getKey() + "." + entry.getValue());
        }

        //problem 16
    TreeMap<Integer,String> treemap2=new TreeMap<>();
    treemap2.put(7,"pineapple");
    treemap2.put(8,"kiwi");
    treemap.putAll(treemap2);
    System.out.println("New TreeMap: "+treemap+"\n");

    //problem 17
    if(treemap.containsKey(2)){
        System.out.println("The Tree Map contains key '2'");
    } else {
        System.out.println("The Tree Map does not contain key'2'");
    }
    if(treemap.containsKey(8)){
        System.out.println("The Tree Map contains key '8'");
    } else {
        System.out.println("The Tree Map does not contain key '8'");
    }

    //problem18
    System.out.println("Checking the entry for 1: ");
    System.out.println("Value is: " + treemap.floorEntry(1));
    System.out.println("Checking the entry for 3: ");
    System.out.println("Value is: " + treemap.floorEntry(3));

    //problem 19
    System.out.println("Reverse order view of the keys: " + treemap.descendingKeySet());

    //Problem 20
    System.out.println("Checking the entry for 3: ");
    System.out.println("Key(s): " + treeeemap.headMap(3));
    System.out.println("Checking the entry for 8: ");
    System.out.println("Key(s): " + trmap.headMap(8));

    //Problem 21
    SortedMap< Integer, String > treemap3 = new TreeMap <> ();
    treemap3 = treemap.subMap(2,4);
    System.out.println("Sub map key-values: " + treemap3);
    }
}