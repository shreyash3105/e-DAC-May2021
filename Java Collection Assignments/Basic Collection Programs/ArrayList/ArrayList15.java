//15. Write a Java program to join two array lists.
import java.util.*;
public class ArrayList15 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println("First ArrayList :" + list); //Printing First ArrayList
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Sixth");
        list2.add("Seventh");
        list2.add("Eighth");
        list2.add("Nineth");
        list2.add("Tenth");
        System.out.println("Second ArrayList :" + list2); //Printing Second ArrayList
        //Joining two ArrayList
        list.addAll(list2);
        System.out.println("Joined ArrayList :" + list); //Printing joined ArrayList
    }
}
