//7. Write a Java program to search an element in an array list.
import java.util.*;
public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println(list);
        Boolean b = list.contains("Fourth");
        if (b){
            System.out.println("Contains the element searched.");
        }
        else{
            System.out.println("Doesn't contain element searhed.");
        }
        
    }
}
