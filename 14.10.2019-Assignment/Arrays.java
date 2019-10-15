import java.util.*;

//array contains fixed number of elements of same datatype
public class Arrays{  
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();

        arr.add(3);
        arr.add(28);
        arr.add(5);

        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        arr.add(0,a);

        for (Integer number : arr) {
            System.out.println(number);
         }  
        }
    }

    