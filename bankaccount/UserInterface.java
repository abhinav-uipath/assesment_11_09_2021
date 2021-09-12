package bankaccount;

import java.util.Scanner;

class Account {
	private String BankAccountNumber;
	private double BankBalance;
	private String CustomerName;

	public String getCustomer_name() {
		return CustomerName;
	}

	public void setCustomer_name(String customer_name) {
		this.CustomerName = customer_name;
	}

	public String getAccount_number() {
		return BankAccountNumber;
	}

	public void setAccount_number(String account_number) {
		this.BankAccountNumber = account_number;
	}

	public double getBalance() {
		return BankBalance;
	}

	public void setBalance(double balance) {
		this.BankBalance = balance;
	}

	public Account(String account_number, String customer_name, double balance) {
		this.BankAccountNumber = account_number;
		this.CustomerName = customer_name;
		this.BankBalance = balance;
	}

}

//Interface
interface MaintainenceCharge {
	public float calculatemaintainencecharge(float noofyears);
}

//Current_account
class CurrentAccount extends Account implements MaintainenceCharge {

	public CurrentAccount(String account_number, String customer_name, double balance) {
		super(account_number, customer_name, balance);

		// TODO Auto-generated constructor stub
	}

	public float calculatemaintainencecharge(float noofyears) {
		int m = 100;
		float n = noofyears;
		float totalcharge = (m * n) + 200;
		return totalcharge;
	}

}

//Saving Account
class SavingAccount extends Account implements MaintainenceCharge {

	public SavingAccount(String account_number, String customer_name, double balance) {
		super(account_number, customer_name, balance);
		// TODO Auto-generated constructor stub
	}

	public float calculatemaintainencecharge(float noofyears) {
		int m = 50;
		float n = noofyears;
		float totalcharge = (m * n) + m;
		return totalcharge;
	}

}

public class UserInterface {
public static void main(String arg[]) {
	String acno;
	String name;
	double bal;
	float years;
	float MaintCharge;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1.Saving Account");
	System.out.println("2.Current Account");
	System.out.println("Enter your choice");
	
	int a = sc.nextInt();
	int choice = a;
	String AccountType="";

	switch(choice)
	{
		case 1:
		System.out.println("Enter Bank account no");
		 acno=sc.next();
		System.out.println("Enter Customer name");
		 name=sc.next();
		System.out.println("Enter Bank Balance");
		 bal=sc.nextDouble();
		System.out.println("Enter Numbers of Years");
	     years=sc.nextFloat();
	     SavingAccount saving =new SavingAccount(acno,name,bal);
	     MaintCharge=saving.calculatemaintainencecharge(years);
	     System.out.println("Customer name"+saving.getCustomer_name());
	     System.out.println("Bank Account number"+saving.getAccount_number());
	     System.out.println("Bank Account Balance "+saving.getBalance());
	     System.out.println("Bank Maintenance Charge for Saving Account is Rs"+MaintCharge);
	     break;
	     
		case 2:
			
		System.out.println("Enter Bank account no");
		 acno=sc.next();
		System.out.println("Enter Customer name");
	    name=sc.next();
		System.out.println("Enter Bank Balance");
		 bal=sc.nextDouble();
		System.out.println("Enter Numbers of Years");
	     years=sc.nextFloat();
	     CurrentAccount  current =new CurrentAccount (acno,name,bal);
	     MaintCharge=current.calculatemaintainencecharge(years);
	     System.out.println("Customer name"+current.getCustomer_name());
	     System.out.println("Bank Account number"+current.getAccount_number());
	     System.out.println("Bank Account Balance "+current.getBalance());
	     System.out.println("Bank Maintenance Charge for Current Account is Rs"+MaintCharge);
		break;
		default:
			System.out.println("Enter Valid Choice");
		}
	// System.out.println(account_type);
	// account no;
}}
