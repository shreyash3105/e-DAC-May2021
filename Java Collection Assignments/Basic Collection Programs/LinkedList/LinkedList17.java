//17. Write a Java program to join two linked lists.
import java.util.*;
public class LinkedList17 {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<String>();
                list.add("First");
                list.add("Second");
                list.add("Third");
                list.add("Fourth");
                System.out.println("Original LinkedList :" + list);  
            LinkedList<String> list2 = new LinkedList<String>();
                list2.add("Fifth");
                list2.add("Sixth");
                list2.add("Seventh");
                list2.add("Eighth");
                System.out.println("Second LinkedList" + list2);
            LinkedList<String> join = new LinkedList<String>();
            join.addAll(list); // joining two LinkedList
            join.addAll(list2);
                System.out.println("List after joining :" + join);
    }
}
