import java.util.*;
class ReverseNumber   
{  
public static void main(String[] args)   
{  
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int number = sc.nextInt();
int reverse = 0;  
for( ;number != 0; number=number/10)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  