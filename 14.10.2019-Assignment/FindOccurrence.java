import java.util.LinkedList;
import java.util.*;
public class FindOccurrence{
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(86);
        list.add(4);
        list.add(1);

        FindOccurrence objFind=new FindOccurrence();
        objFind.find(list);

    }

    public void find(LinkedList list){
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=list.size();

        int sindex=-1;
        for(int i=0;i<n;i++){
            if(list.get(i).equals(num)){
                System.out.println(i);
                sindex=i;
                break;
            }
        }

        for(int i=n-1;i>sindex;i--){
            if(list.get(i).equals(num)){
                System.out.println(i);
                break;
            }
        }
        
    }
}