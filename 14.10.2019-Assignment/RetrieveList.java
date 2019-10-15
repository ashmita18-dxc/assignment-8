import java.util.*;

public class RetrieveList{
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        System.out.println(list);

        int last=list.peekLast();
        System.out.println("The last element of the list is: "+last);
        
        //Problem 14
        System.out.println("Removed Element: "+list.pop());
        System.out.println("New List: "+list);
    }
}