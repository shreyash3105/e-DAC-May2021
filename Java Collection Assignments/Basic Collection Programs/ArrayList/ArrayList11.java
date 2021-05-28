//11. Write a Java program to reverse elements in an array list.
import java.util.*;
class ArrayList11{
   public static void main(String[]args) {
     ArrayList<String> list = new ArrayList<String>(); //Creating a new ArrayList
      list.add("Red");
      list.add("Black");
      list.add("Pink");
      list.add("Yellow");
      list.add("Blue");
      list.add("Green");
      System.out.println("ArrayList before reversing :" + list);
      Collections.reverse(list); // Reversing ArrayList
      System.out.println("ArrayList after reversing :" + list);
   }
}