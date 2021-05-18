import java.util.*;
/*06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. 
Then calculate and print the area and circumference of the circle.*/

public class Q6 {
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter the value of radius :");
int r = sc.nextInt();

float a =(float) 3.14 * r*r;
System.out.println("Area of circle is : " + a);
double b =(float) 2*3.14*r;
System.out.println("Circumference of circle is :" + b);
	}
}