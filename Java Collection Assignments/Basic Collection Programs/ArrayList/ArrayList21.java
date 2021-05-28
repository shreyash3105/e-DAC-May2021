//21. Write a Java program to replace the second element of an ArrayList with the specified element.
import java.util.*;
class ArrayList21{
   public static void main(String[]args) {
     ArrayList<String> list = new ArrayList<String>(); //Creating a new ArrayList
      list.add("Red");
      list.add("Black");
      list.add("Pink");
      list.add("Yellow");
      list.add("Blue");
      list.add("Green");
      System.out.println("ArrayList before replacing :" + list);
      list.set(1, "Orange"); //replacing second element
      System.out.println("ArrayList after replacing :" + list);
   }
}