/*9. Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
with separate methods for each operation whose real and imaginary parts are entered by user.*/
import java.util.*;
public class Complex {
    double real1;
    double real2;
    double imaginary1;
    double imaginary2;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Complex obj = new Complex();
        obj.operations();
    }
    Complex(){
        System.out.println("Enter the First Real no. :");
        this.real1 = sc.nextDouble();
        System.out.println("Enter the First Imaginary no. :");
        this.imaginary1 = sc.nextDouble();
        System.out.println("Enter the Second Real no. : ");
        this.real2 = sc.nextDouble();
        System.out.println("Enter the  Second Imaginary no. :");
        this.imaginary2 = sc.nextDouble();
        }
    void operations(){
        System.out.println("First complex number is : (" +real1+" + "+imaginary1+ "i)");
        System.out.println("Second complex number is : (" +real2+" + "+imaginary2+ "i)");
        double sum1=real1+real2;
        double sum2=imaginary1+imaginary2;
        double difference1=real1-real2;
        double difference2=imaginary1-imaginary2;
        double product1=real1*real2;
        double product2=imaginary1*imaginary2;
        System.out.println("Sum of complex number : (" +sum1+ " + " +sum2+"i)");
        System.out.println("Difference of complex number : (" +difference1+ " + " +difference2+"i)");
        System.out.println("Product of complex number : (" +product1+ " + " +product2+"i)");
    }
    }
    