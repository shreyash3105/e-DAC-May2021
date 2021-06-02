//25. Write a Java program to test whether a linked list is empty or not.
import java.util.*;
public class LinkedList25{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("Original LinkedList :" + list);
        System.out.println("Check if list is empty or not : " + list.isEmpty());
        list.removeAll(list);
        System.out.println("Check if list is empty or not : " + list.isEmpty());
}
}