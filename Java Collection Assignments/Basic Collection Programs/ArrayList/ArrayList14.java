//14. Write a Java program of swap two elements in an array list.
import java.util.*;
public class ArrayList14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Before Swapping the elements :" + list);
            Collections.swap(list, 2, 5); //Swapping two elements
            System.out.println("After Swapping the elements :" + list);
    }
}