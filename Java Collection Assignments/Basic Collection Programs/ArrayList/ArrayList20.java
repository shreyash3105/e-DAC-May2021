//20. Write a Java program to increase the size of an array list.
import java.util.*;
public class ArrayList20 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(6);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        list.ensureCapacity(100); //Imcreasing the size of array
        System.out.println("ArrayList numbers can now store upto 100 elements.");
    }
    
}
