//6. Write a Java program to remove the third element from an array list.
import java.util.*;
public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println("Before removing Third Element :" + list);
        list.remove(2);
        System.out.println("After removing third element :" + list);
    }
}
