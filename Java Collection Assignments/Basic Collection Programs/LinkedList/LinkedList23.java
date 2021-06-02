//23. Write a Java program to convert a linked list to array list.
import java.util.*;
public class LinkedList23 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Original LinkedList :" + list);
            List<String> list2 = new ArrayList<String>(list); //Converting LinkedList to ArrayList.
            System.out.println("Converted ArrayList :" + list2); 
}
}