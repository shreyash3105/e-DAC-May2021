//17. Write a Java program to empty an array list.
import java.util.*;
public class ArrayList17 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println(list); //List containing elements
        list.clear(); //Clearing the ArrayList
        System.out.println(list); //Empty List
    }
}
