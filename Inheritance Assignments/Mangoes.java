// Make a class named Fruit with a data member to calculate the
// number of fruits in a basket. Create two other class named
// Apples and Mangoes to calculate the number of apples and
// mangoes in the basket. Print the number of fruits of each type
// and the total number of fruits in the basket.

import java.util.*;

abstract class Fruit{
	static int count=0;
	public abstract void cal(int a);
}
class Apples extends Fruit{
	public void cal(int a) {
		count= count+a;
	}
}
public class Mangoes extends Apples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Apples a = new Apples();
		System.out.println("Enter the number of apples:");
		int app = sc.nextInt();
		a.cal(app);
		
        System.out.println("Enter the number of mangoes:");
		Mangoes m = new Mangoes();
		int mango =sc.nextInt();
		m.cal(mango);
		
        System.out.println("Number of fruits in basket \n" + "Apples = " +app+ " Mangoes = " +mango);
		System.out.println("Total number of fruits in basket: " +Fruit.count);
	}
}
