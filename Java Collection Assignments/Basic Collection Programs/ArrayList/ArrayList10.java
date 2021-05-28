//10. Write a Java program to shuffle elements in an array list.
import java.util.*;
public class ArrayList10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("ArrayList Before shuffling elements :" + list);
        Collections.shuffle(list); //Shuffing ArrayList
        System.out.println("Arraylist After shuffling elements :" + list);
    }
    
}
