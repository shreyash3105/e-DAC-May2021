/*7. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of
its length and breadth as parameters of its constructor and having a method named 'returnArea' which
returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/
import java.util.*;
class Area {
    int length;
    int breadth;

    Area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length");
        this.length = sc.nextInt();
        System.out.println("Enter the value of breadth");
        this.breadth = sc.nextInt();
    }
    
    void returnArea()
    {
       int area=length*breadth;
        System.out.println("Area of Rectangle is =" +area);
        }
}

    public  class Rectangle3 {
        public static void main(String[] args) {
            Area obj = new Area();
            obj.returnArea();
         }
    }
