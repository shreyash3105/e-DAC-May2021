//2. Write a Java program to iterate through all elements in a linked list.
import java.util.*;
public class LinkedList2 {
    public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        Iterator<String> itr=list.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next()); 
}
}
}