import java.util.Scanner;
/*
 	All the banks operating in India are controlled by RBI. RBI has
	set a well defined guideline (e.g. minimum interest rate,
	minimum balance allowed, maximum withdrawal limit etc)
	which all banks must follow. For example, suppose RBI has set
	minimum interest rate applicable to a saving bank account to be
	4% annually; however, banks are free to use 4% interest rate or to
	set any rates above it.
	Write a program to implement bank functionality in the above
	scenario. Note: Create few classes namely Customer, Account,
	RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc).
	Assume and implement required member variables and functions
	in each class.
 */
class UI{
	public static void print(Object input) {
		 System.out.println(input);
	}
	public static void println() {
		 System.out.println();
	}
}

class Customer{
	 String name;
	 int adharNo;
	 String addr;
	 
	 void getDetailsCust(){
		 Scanner sc = new Scanner(System.in);
		 UI.print("Enter Customer name:");
		 name = sc.nextLine();
		 UI.print("Enter Customer Adhar Number:");
		 adharNo = sc.nextInt();
		 UI.print("Enter address");
		 sc.nextLine();
		 addr = sc.nextLine(); 
	 }
	 void display() {
		UI.print("Customer name:"+name);
		UI.print("Adhar card number:"+adharNo);
		UI.print("Address:"+addr);
	 }
}

class Account{
	 int accNo;
	 String branch; 
	
	 void getDetailsAcc(){
		 Scanner sc = new Scanner(System.in);
		 UI.print("Enter Account Number:");
		 accNo = sc.nextInt();
		 
		 UI.print("Enter Branch in which you have acc");
		 sc.nextLine();
		 branch = sc.nextLine();	 	
	 }
	 void display() {
			UI.print("Account number:"+accNo);
			UI.print("Branch:"+branch);
		 }
}

class RBI{
	double minInterestRate;
	double minBalAllowed;
	double maxWidLimit; 
	
	RBI(double minInterestRate,double minBalAllowed,double maxWidLimit){
		 this.minInterestRate = minInterestRate;
		 this.minBalAllowed = minBalAllowed;
		 this.maxWidLimit = maxWidLimit;
		 this.display();
	}
	void display() {
		UI.print("Minimum Interest Rate:"+minInterestRate);
		UI.print("Minimum balance Allowed:"+minBalAllowed);
		UI.print("Maximum Withdrawal Limit:"+maxWidLimit);
		UI.println();
	}
}

 class SBI extends RBI{
	 SBI(double minInterestRate, double minBalAllowed, double maxWidLimit) {
		super(minInterestRate, minBalAllowed, maxWidLimit);
     }
 }
 
 class ICICI extends RBI{
	ICICI(double minInterestRate, double minBalAllowed, double maxWidLimit) {
		super(minInterestRate, minBalAllowed, maxWidLimit);	
	}
 }
 
 class PNB extends RBI{
	PNB(double minInterestRate, double minBalAllowed, double maxWidLimit) {
		super(minInterestRate, minBalAllowed, maxWidLimit);
	}
 }

public class Bank {
	public static void main(String[] args) {
		UI.print("Read guidelines and restrictions of Banks");
		UI.print("RBI details:");
		RBI rbi = new RBI(0.04,10000,50000);
		UI.print("SBI details:");
			rbi = new SBI(0.06,5000,100000);
		UI.print("ICICI details:");
			rbi = new ICICI(0.07,0,150000);
		UI.print("PNB details:");
			rbi = new PNB(0.05,8000,60000);
		UI.println();
		UI.print("Now enter your personal and account details:");
		Customer cust = new Customer();
		cust.getDetailsCust();
		
		Account acc = new Account();
		acc.getDetailsAcc();
		
		cust.display();
		acc.display();	
	}
}