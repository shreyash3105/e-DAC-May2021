//26. Write a Java program to replace an element in a linked list.
import java.util.*;
public class LinkedList26 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Original LinkedList :" + list);
            list.set(2, "NEW");
            System.out.println("List after element replacement :" + list);
    }
}
