/*We want to calculate the total marks of each student of a class in
Physics,Chemistry and Mathematics and the average marks of
the class. The number of students in the class are entered by the
user. Create a class named Marks with data members for roll
number, name and marks. Create three other classes inheriting
the Marks class, namely Physics, Chemistry and Mathematics,
which are used to define marks in individual subject of each
student. Roll number of each student will be generated
automatically.*/
import java.util.*;
 abstract class Student extends Marks{
	abstract void method();
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter students Name " );
		String name = sc.nextLine();
		System.out.println("Enter Rollno Name " );
		int rollno = sc.nextInt();

		physics P = new physics();
		//int pmark = P.fun();
		P.fun();
		Chemistry C = new Chemistry();
		int cmark = C.fun();
		
		Mathematics M = new Mathematics();
		int mmark = M.fun();

		int total_marks = Pmark + cmark + mmark;
		int Average = (total_marks/3);
		System.out.println("----------------------------");
		System.out.println("Name"+name+ " Rollno " +rollno+ " Total_Marks " +total_marks+ " Average " +Average);	
		
	}
}
class Marks{
		int rollno;
		String name;
		int marks;
		Scanner sc = new Scanner(System.in);
		Marks(){}
		Marks(int rollno,String name,int marks){
		
		}
		
		
    static int Pmark;
}
    class physics extends Marks{
			void fun(){
				System.out.println("Enter students physics marks :");
				super.Pmark = sc.nextInt();
				//return Pmark;
			}
		}
			class Chemistry extends Marks{
				int fun(){
				System.out.println("Enter students Chemistry marks :");
				int Cmark = sc.nextInt();
				return Cmark;
			}
            }
			class Mathematics extends Marks{
			int fun(){
				System.out.println("Enter students maths marks :");
				int Mmark = sc.nextInt();
				return Mmark;
			}	
		}
		
