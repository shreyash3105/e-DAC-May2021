//14. Write a Java program to remove all the elements from a linked list.
import java.util.*;
public class LinkedList14{
public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println("Original LinkedList :" + list);  
        list.removeAll(list); //Removing all elements from list.
        System.out.println("After Removing all elements :" + list);
}
}