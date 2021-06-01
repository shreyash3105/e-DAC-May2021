//15. Write a Java program of swap two elements in a linked list.
import java.util.*;
public class LinkedList15 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Original LinkedList :" + list);  
            Collections.swap(list, 2, 5); //Swapping two elements.
            System.out.println("After swapping two elements :" + list);
}
}