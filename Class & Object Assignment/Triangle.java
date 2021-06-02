/* 3. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' without any parameter in its constructor.*/
import java.util.*;
public class Triangle {
   public static void main(String[] args) {
       dimension obj = new dimension();
       obj.details();
       obj.display();
   }
}
class dimension{
    int a;
    int b;
    int c;
    void  details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1 :");
        this.a = sc.nextInt();
        System.out.println("Enter Side 2 :");
        this.b = sc.nextInt();
        System.out.println("Enter Side 3 :");
        this.c = sc.nextInt();
    }
    void display(){
        int perim = a+b+c;
        System.out.println("Perimeter :" + perim);
        int area = a*b;
        area = area/2;
        System.out.println("Area :" + area);
    }
}