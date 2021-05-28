//18. Write a Java program to test if an array list is empty or not.
import java.util.*;
public class ArrayList18 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Checking if list is empty or not
        Boolean ans = list.isEmpty();
        if (ans == true){
            System.out.println("ArrayList is empty");
        }
        else {
            System.out.println("ArrayList is not empty");
        }
        // adding elements to list
        list.add(2);
        list.add(4);
        //Again checking if list is empty or not
        Boolean ans1 = list.isEmpty();
        if (ans1 == true){
            System.out.println("ArrayList is empty");
        }
        else {
            System.out.println("ArrayList is not empty");
        }
    }
}