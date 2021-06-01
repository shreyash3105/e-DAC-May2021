//1. Write a Java program to append the specified element to the end of a linked list.
import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println("LinkedList before appending element :" + list);
        list.addLast("Last");
        System.out.println("LinkedList after appending element :" + list);
    }
}