/*1. Write a Java program to create a new array list, add some colors (string) 
and print out the collection*/
import java.util.*;
class ArrayList1{

   public static void main(String[]args) {
     ArrayList<String> list = new ArrayList<String>(); //Creating a new ArrayList
      list.add("Red");
      list.add("Black");
      list.add("Pink");
      list.add("Yellow");
      System.out.println(list); //Printing out the collection.
   }
}