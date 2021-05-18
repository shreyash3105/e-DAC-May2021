/*14.	Program to check that entered year is a leap year or not.*/
import java.util.*;
public class Q14
{
	public static void main(String [] args)	
	{
	    int year;
             	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter year :");
                   year=sc.nextInt();	     
	    if(year%400==0 || year%4==0 || year%100==0)
                  	System.out.println(year+" is a leap year");
	    else
	   	 System.out.println(year+" is not a leap year");                       
 	 }
}