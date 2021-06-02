//24. Write a Java program to compare two linked lists.
import java.util.*;
public class LinkedList24 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            System.out.println("First LinkedList :" + list);
        LinkedList<String> list2 = new LinkedList<String>();   
            list2.add("First");
            list2.add("Second");
            list2.add("Fourth");
            list2.add("Fifth");
            System.out.println("Second LinkedList :" + list2);
        LinkedList<String> list3 = new LinkedList<String>();
            for (String e : list)
               list3.add(list2.contains(e) ? "Yes" : "No");
            System.out.println(list3); 
}
}
