/*10. Write a program that would print the information (name, year of joining, salary, address) of three
employees by creating a class named 'Employee'. The output should be as follows:
Name     Year of joining        Address
Robert   1994              64C- WallsStreat
Sam      2000              68D- WallsStreat
John     1999              26B- WallsStreat*/
class Employee{
	String name;
	int year;
	String addr;
	Employee(String name, int year, String addr){
		this.name = name;
		this.year = year;
		this.addr = addr;
	}
}
public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Robert",1994,"64C- WallsStreat");
		Employee emp2 = new Employee("Sam",2000,"68D- WallsStreat");
		Employee emp3 = new Employee("John",1999,"26B- WallsStreat");
		System.out.printf("%-10s %10s %15s \n","Name","Year of Joining","Address");
		System.out.printf("%-10s %10s %25s \n",emp1.name,emp1.year,emp1.addr);
		System.out.printf("%-10s %10s %25s \n",emp2.name,emp2.year,emp2.addr);
		System.out.printf("%-10s %10s %25s \n",emp3.name,emp3.year,emp3.addr);
	}
}