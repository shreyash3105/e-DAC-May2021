//6. Write a Java program to insert elements into the linked list at the first and last position.
import java.util.*;
public class LinkedList6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Before adding elements :" + list);
            list.addFirst("FIRST"); //Adding element at first position
            list.addLast("LAST"); //Adding element at last position
            System.out.println("After adding elements :" + list);
    }
}