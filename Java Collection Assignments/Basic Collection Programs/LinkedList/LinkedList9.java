//9. Write a Java program to insert some elements at the specified position into a linked list.
import java.util.*;
public class LinkedList9{
public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println("Before adding elements :" + list);
        list.add(2, "Extra");
        System.out.println("After adding elements :" + list);
}
}