//13. Write a Java program to compare two array lists.
import java.util.*;
public class ArrayList13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth"); 
        list.add("Sixth"); 
        System.out.println("First ArrayList :" + list); //Printing First ArrayList
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("First");
        list2.add("Second");
        list2.add("Third");
        list2.add("Fourth");
        list2.add("Fifth"); 
        list2.add("Sixth"); 
        System.out.println("Second ArrayList :" + list2); //Printing Second ArrrayList
        //Comparing The two ArrayList's
        if(list.equals(list2) == true){ //Checking if both list's are same
            System.out.println("Both list's are same");
        }
        else {
            System.out.println("Both list's are not same");
        }
        }
    }   
