//5. Write a Java program to update specific array elements by a given element. 
import java.util.*;
public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        System.out.println("Before Updating :\n" + list);
        list.set(2, "Seventh"); //updating the second element by using set
        System.out.println("After Updating :\n" + list);
        //ArrayList <String> list2 = Arrays.asList(Elements);{sysout (list2)} (To add more elements)
    }
}
