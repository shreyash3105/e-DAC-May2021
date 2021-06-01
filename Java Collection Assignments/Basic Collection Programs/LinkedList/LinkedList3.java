//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.*;
public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            list.add("Fifth");
            list.add("Sixth");
            for(int i=2; i<list.size(); i++)
                {
                    System.out.println(list.get(i));
                }
        }
}
