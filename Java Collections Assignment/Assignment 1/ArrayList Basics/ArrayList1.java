/*1. Write a Java program to create a new array list, add some colors (string) 
and print out the collection*/
import java.util.*;
class ArrayList1{

   public static void main(String[]args) {
     ArrayList<String> list = new ArrayList<String>();
      list.add("Red");
      list.add("Black");
      list.add("Pink");
      list.add("Yellow");
      for(int i =0; i<list.size(); i++){
         System.out.println(list.get(i));
      }
   }
}