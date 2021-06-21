/*11. Add two distances in inch-feet by creating a class named 'AddDistance'.*/
import java.util.Scanner;

class AddDistance{
	int feets;
	int inches;

	Scanner sc = new Scanner(System.in);
	
	void getDistance() {
		System.out.print("Enter feets:");
		feets = sc.nextInt();
		System.out.print("Enter inches:");
		inches = sc.nextInt();
	}
	
	void calcDistance(AddDistance d1, AddDistance d2) {
		inches = d1.inches + d2.inches;
		feets = d1.feets+d2.feets+(inches/12);
		inches = inches%12;
	}
	
	void displayDistance() {
		System.out.println("Sum of distance is:");
		System.out.println("Feet:"+feets+" Inches:"+inches);
	}
}
public class Distance {
	public static void main(String[] args) {
		AddDistance dist1 = new AddDistance();
		System.out.println("Enter distance 1:");
		dist1.getDistance();
		AddDistance dist2 = new AddDistance();
		System.out.println("Enter distance 2:");
		dist2.getDistance();
		
		AddDistance d = new AddDistance();
		d.calcDistance(dist1, dist2);
		
		d.displayDistance();
	}
}