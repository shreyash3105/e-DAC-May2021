/*10.	Write a program to convert temperature from Fahrenheit to Celsius. 
Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ].*/
import java.util.*;

class Q10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature :");
		int F = sc.nextInt();
		int C = 5*(F-32)/9;
		System.out.println("The temperature in Fahrenheit is "+ F +" and temperature in Celcius is "+ C);
	}
}