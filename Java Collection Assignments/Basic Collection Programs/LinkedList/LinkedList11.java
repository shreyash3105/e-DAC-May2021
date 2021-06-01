//11. Write a Java program to display the elements and their positions in a linked list.
import java.util.*;
public class LinkedList11{
public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println("Original linked list:" + list);  
    for(int i=0; i < list.size(); i++)
    {
      System.out.println("Element at index "+i+": "+list.get(i));
    } 
}
}
