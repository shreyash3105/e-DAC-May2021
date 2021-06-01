//7. Write a Java program to insert the specified element at the front of a linked list.
import java.util.*;
public class LinkedList7 {
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
            //list.addLast("LAST"); //Adding element at last position
            System.out.println("After adding elements :" + list);
    }
}