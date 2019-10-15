import java.util.*;

public class Retrieve{
    public static void main(String[] args){

        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(23);
        arr.add(3);
        arr.add(100);
        arr.add(19);
        arr.add(10);

        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(23);
        list.add(3);
        list.add(100);
        list.add(19);
        list.add(10);


        System.out.println("Enter the index number: ");
        Scanner s=new Scanner(System.in);
        int index=s.nextInt();

        int ret=arr.get(index);
        System.out.println("The element at the given index is: "+ret);

    }
}