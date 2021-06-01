//4. Write a Java program to iterate a linked list in reverse order.
import java.util.*;
public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            Iterator<String> itr=list.descendingIterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next()); 
        }
    }
}