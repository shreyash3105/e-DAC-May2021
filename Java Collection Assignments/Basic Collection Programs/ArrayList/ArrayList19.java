//19. Write a Java program to trim the capacity of an array list the current list size.
import java.util.*;
public class ArrayList19 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.trimToSize(); //Trimming arraylist to Current list size
        for (int num: list){
            System.out.println("Elements :" + num);
        }
        }
    }
    
