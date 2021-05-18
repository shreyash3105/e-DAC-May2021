/*08.	Write a program to find the simple interest. 
Take the principle amount, rate of interest and time from user using Scanner class.*/
import java.util.*;

public class Q8 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the principal: ");
    int p = sc.nextInt();

    System.out.print("Enter the rate: ");
    int r = sc.nextInt();

    System.out.print("Enter the time: ");
    int t = sc.nextInt();

    int i = (p * t * r) / 100;

    System.out.println("Principal: " + p);
    System.out.println("Interest Rate: " + r);
    System.out.println("Time Duration: " + t);
    System.out.println("Simple Interest: " + i);
  }
}