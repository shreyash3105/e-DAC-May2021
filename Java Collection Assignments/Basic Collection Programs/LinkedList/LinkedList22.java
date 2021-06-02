//22. Write a Java program to check if a particular element exists in a linked list.
import java.util.*;
public class LinkedList22 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Original LinkedList :" + list);
            //Boolean ele;
            if (list.contains("Second")){
                System.out.println(list.get(1) + " Exists in list.");
            }
            else {
                System.out.println("Element does not exist.");
            }
}
}