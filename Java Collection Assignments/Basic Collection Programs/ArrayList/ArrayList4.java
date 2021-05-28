//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.*;
public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
        System.out.println(list.get(4));
    }
}