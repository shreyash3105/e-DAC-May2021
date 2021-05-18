/*03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]*/

public class Q3 {

	public static void main(String[] args) {
	int x = 1;
	int y = 2;
	int z = 3;
	y = x^2 + 3*x - 7;
	System.out.println("A. :" + y);
	
	y = x++ + ++x;
	System.out.println("B. :" + x + "," + y);
	
	z = x++ - --y - --x  +  x++;
	System.out.println("C. :" + x + "," + y + "," + z);	
	
	boolean X=true,Y=false,Z=true;
    Z=X&&Y ||!(X||Y);
    System.out.println("D. :z=" + Z);


	}

}
