import java.util.*;

public class ReverseIterate{
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        System.out.println("Original List: "+list);

        Collections.reverse(list);
        System.out.println(list);
        
    }
}