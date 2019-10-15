import java.util.*;

public class CompareArray{
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<String>();
        arr1.add("apple");
        arr1.add("banana");
        arr1.add("guava");
        arr1.add("grapes");
        arr1.add("pear");
        System.out.println(arr1);

        ArrayList<String> arr2=new ArrayList<String>();
        arr2.add("apple");
        arr2.add("banana");
        arr2.add("grapes");
        arr2.add("guava");
        arr2.add("pear");
        System.out.println(arr2);

        System.out.println(arr1.equals(arr2));
    }
}