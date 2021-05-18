/*07.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
Take the obtained marks from user using Scanner class. 
Output should be in this format [ percentage marks = 99 % ]. 
Use concatenation operator here.*/
import java.util.*;
public class Q7 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	    float total, Percentage;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();	
		
		total = english + chemistry + computers + physics + maths;
	    Percentage = (total / 500) * 100;
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Marks Percentage =  " + Percentage);
	}
}
