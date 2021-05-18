/*12.	In a company an employee is paid as under: 
	If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
	If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
	If the employee's salary is input by the user write a program to find his gross salary. 
[ formula : GS= Basic + DA + HRA ]*/
import java.util.*;

public class Q12
{
    	public static void main( String [] args ) 
    	{
		Scanner sc = new Scanner(System.in);
	
		float bs, gs, da, hra;

		System.out.print("Enter basic salary:");
		bs = sc.nextFloat();
	
		if (bs<1500)
		{
			hra = bs * 10 / 100;
			da = bs * 90 / 100;
		}
		else
		{
			hra = 500;
			da = bs * 98 / 100;
		}
		gs = bs + da + hra;
		System.out.println("Gross salary = Rs." + gs);
    }

}
