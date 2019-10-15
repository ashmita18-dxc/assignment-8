import java.util.*;

public class Iterate{
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        System.out.println("Original List: "+list);
        
        System.out.println("Enter an index number: ");
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();

        for(int i=index;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
    }
}