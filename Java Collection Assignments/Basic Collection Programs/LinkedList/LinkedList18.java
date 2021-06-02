//18. Write a Java program to clone an linked list to another linked list.
import java.util.*;
public class LinkedList18 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Original LinkedList :" + list);
            LinkedList<String> list2 = new LinkedList<String>();
            list2 = (LinkedList)list.clone();
            System.out.println("Cloned LinkedList :" + list2);
}
}