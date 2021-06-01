// 16. Write a Java program to shuffle the elements in a linked list.
import java.util.*;
public class LinkedList16 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("Original LinkedList :" + list);  
            Collections.shuffle(list); //Shuffling elements in list.
            System.out.println("After shuffling :" + list);
}
}