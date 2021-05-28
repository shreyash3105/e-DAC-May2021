//9. Write a Java program to copy one array list into another.
import java.util.*;
public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original ArrayList :" + list);
        ArrayList<Integer> list2 = list; //Copying one ArrayList into another
        System.out.println("Copied ArrayList :" + list2);
        }
    }
    
