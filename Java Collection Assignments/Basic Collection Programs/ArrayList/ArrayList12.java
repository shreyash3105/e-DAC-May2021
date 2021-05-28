//12. Write a Java program to extract a portion of an array list.
import java.util.*;
public class ArrayList12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println("Complete ArrayList :" + list);
        List<Integer> list2 = list.subList(2 , 5); //Extracting a specipic portion from original list
        System.out.println("A portion of ArrayList :" + list2);
        }
    }