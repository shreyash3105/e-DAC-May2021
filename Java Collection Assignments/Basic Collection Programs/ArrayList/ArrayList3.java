// 3. Write a Java program to insert an element into the array list at the first position.
import java.util.*;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add(0, "Fifth"); //adding element at first position
        list.add(3, "Sixth"); //adding element at third position
        //list.add(index, element);
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
         }
    }   
}
