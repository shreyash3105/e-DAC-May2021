//5. Write a Java program to insert the specified element at the specified position in the linked list
import java.util.*;
public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Before adding element :" + list);
            list.add(3, "Extra");
            System.out.println("After ading element :" + list);
    }
}