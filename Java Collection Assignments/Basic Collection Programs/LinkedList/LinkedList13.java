// 13. Write a Java program to remove the first and last element from a linked list.
import java.util.*;
public class LinkedList13{
public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println("Original LinkedList :" + list);  
        list.removeFirst(); //Removing first element from list.
        list.removeLast(); //Removing last element from list.
        System.out.println("After Removing element :" + list);
}
}