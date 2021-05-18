/*13.	Program to find greatest in 3 numbers. 
[ once using if else statement and then using ternary operator ( logical operator) ]*/
public class Q13 {

    public static void main(String[] args) {

        int x = 2, y = 6, z = 5;

        if(x >= y) {
            if(x >= z)
                System.out.println(x + " is the largest number.");
            else
                System.out.println(z + " is the largest number.");
        } else {
            if(y >= z)
                System.out.println(y + " is the largest number.");
            else
                System.out.println(z + " is the largest number.");
        }
        int max;
        
        max = (x > y) ?
                (y > z ? x : z) :
                (y > z ? y : z);
          
          System.out.println("Largest number among " + x +
                                   ", " + y + " and " + z +
                                       " is " + max + ". " );
    }
}