//21. Write a Java program to retrieve but does not remove, the last element of a linked list.
import java.util.*;
public class LinkedList21 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Original LinkedList :" + list);
            System.out.println("Retrieval of last element :" + list.getLast());
}
}
