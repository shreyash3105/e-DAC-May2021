//8. Write a Java program to sort a given array list.
import java.util.*;
public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println("Before sorting ArrayList is :" + list);
        Collections.sort(list);
        System.out.println("After sorting in ascending order :" + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After sorting in Descending order :" + list);

    }
}
