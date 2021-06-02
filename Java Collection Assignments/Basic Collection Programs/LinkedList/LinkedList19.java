// 19. Write a Java program to remove and return the first element of a linked list.
import java.util.*;
public class LinkedList19 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Original LinkedList :" + list);
            list.removeFirst();
            System.out.println("List after removal of first element :" + list);
}
}
