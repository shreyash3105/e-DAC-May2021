//Assign and print the roll number, phone number and address of two students having names "Sam"
//and "John" respectively by creating two objects of class 'Student'.

import java.util.*;

 class Student1 {
    Scanner sc = new Scanner (System.in);
    String Name;
    int Rollno;
    long phone;
    String Address;
void getinfo(){
        System.out.println("Enter the name: ");
        this.Name = sc.nextLine();
        System.out.println("Enter the Rollno: ");
        this.Rollno = sc.nextInt();
        System.out.println("Enter the phone: ");
        this.phone = sc.nextLong();
        System.out.println("Enter the Address: ");
        this.Address = sc.nextLine();
        this.Address = sc.nextLine();
        
}
void display()
{
    System.out.println("=================================================================");
    System.out.println("Student Name : " +Name+ "\nRollno : " +Rollno+ "\nPhone : " +phone+ "\nAddress : " +Address);
}


}
class Student2{
    public static void main(String[] args) {
        Student1 array [] = new Student1[2];
        for(int i=0;i<array.length;i++)
       { array [i] = new Student1();
       array [i].getinfo();
    }
    for(int i=0;i<array.length;i++){
    array [i].display();
    }
        }
    }