/*8. Print the average of three numbers entered by user by creating a class named 'Average' having a
method to calculate and print the average.*/
import java.util.*;
public class Average {
    int a;
    int b;
    int c;
    void numbers(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number :");
        this.a = sc.nextInt();
        System.out.println("Enter Second Number :");
        this.b = sc.nextInt();
        System.out.println("Enter Third Number :");
        this.c = sc.nextInt();
    }
    void display(){
        int average = ((a+b+c)/2);
        System.out.println("Average of three numbers is :" +average);
}
    public static void main(String[] args) {
        Average obj = new Average();
        obj.numbers();
        obj.display();
    }
}
