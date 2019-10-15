import java.util.*;

public class LinkedToArr{
    public static void main(String[] args){
    LinkedList<String> l_list=new LinkedList<String>();
        l_list.add("apple");
        l_list.add("banana");
        l_list.add("guava");
        l_list.add("pineapple");
        l_list.add("grapes");
        l_list.add("mango");
        System.out.println("Linked List: "+l_list);

        //conversion of LinkedList to ArrayList
        ArrayList<String> arr_list=new ArrayList<>(l_list);
        System.out.println("The LinkedList is converted to an ArrayList!!");
        System.out.println("ArrayList: ");
        for (String str : arr_list){
            System.out.print(str + " ");
        }
    }
}