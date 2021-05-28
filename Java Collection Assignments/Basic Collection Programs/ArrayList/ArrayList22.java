//22. Write a Java program to print all the elements of an ArrayList using the position of the elements.
import java.util.*;
public class ArrayList22 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list); //Priting ArrayList
        int num = list.size();
        for(int i = 0; i<num;i++){
             System.out.println(list.get(i)); //Printing using the position of elements
        }
        
    }
}