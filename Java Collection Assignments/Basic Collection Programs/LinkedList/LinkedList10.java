//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
import java.util.*;
public class LinkedList10{
public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println("First element is : " + list.getFirst());
        System.out.println("Last element is : " + list.getLast());
}
}