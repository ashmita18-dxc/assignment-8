import java.util.*;

public class Search{
    public static void main(String[] args){
        ArrayList<String> arr= new ArrayList<>();
        arr.add("apple");
        arr.add("banana");
        arr.add("guava");
        System.out.println("Enter the element:");
        Scanner sc=new Scanner(System.in);
        String a=sc.next();

            for(int i=0;i<arr.size();i++){
                if (arr.get(i).equals(a)){
                    System.out.println("The index of the given element is: "+i);
                }
            }
        }
       
}