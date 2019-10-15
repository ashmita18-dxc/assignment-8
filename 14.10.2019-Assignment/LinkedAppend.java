import java.util.*;

public class LinkedAppend{
    public static void main(String[] args){
    LinkedList<String> list=new LinkedList<String>();
        list.add("apple");
        list.add("banana");
        list.add("guava");
        list.add("orange");
        list.add("pineapple");
        list.add("kiwi");

        System.out.println("Enter a new element: ");
        Scanner sc=new Scanner(System.in);
        String newElement=sc.next();

        list.addLast(newElement);

        System.out.println("Updated LinkedList: "+list);
    }
}