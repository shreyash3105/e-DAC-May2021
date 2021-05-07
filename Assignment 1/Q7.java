import java.util.*;
 
class Q7 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input a number: ");
  int a = in.nextInt();
   
  for (int i=0; i< 10; i++){
   System.out.println(a + " x " + (i+1) + " = " + 
     (a * (i+1)));
  }
 }
}