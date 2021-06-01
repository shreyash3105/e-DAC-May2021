//12. Write a Java program to remove a specified element from a linked list.
import java.util.*;
public class LinkedList12{
public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println("Original LinkedList :" + list);  
        list.remove("Third"); //Removing specified element from list.
        System.out.println("After Removing element :" + list);
}
}

