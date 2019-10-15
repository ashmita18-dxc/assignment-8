import java.util.*;

public class Sort{
    public static void main(String[] args){
        ArrayList<String> arr= new ArrayList<>();
        arr.add("apple");
        arr.add("banana");
        arr.add("guava");
        arr.add("orange");
        arr.add("pineapple");
        arr.add("kiwi");
        arr.add("grapes");
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println("Sorted ArrayList:"+ arr);

    }
}