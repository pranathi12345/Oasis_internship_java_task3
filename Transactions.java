import java.io.*;
import java.util.*;
import java.sql.Timestamp;
public class Transactions{
	Scanner input=new Scanner(System.in);
	Timestamp ctime=new Timestamp(System.currentTimeMillis());
	String user;
	int balance=0;
	String str;
	public void functionalities() {
		System.out.println("Select your choice");
		System.out.println("1.With draw");
		System.out.println("2.Deposit");
		System.out.println("3.Transfer");
		System.out.println("4.Balance");
		System.out.println("5.Quit");
		System.out.println("Enter your choice ");
		int choose=input.nextInt();
	    Transactions usr=new Transactions();
		switch(choose) {
		case 1:
			balance=usr.withdraw(balance);
			break;
		case 2:
			balance=usr.deposit(balance);
			break;
		case 3:
			balance=usr.transfer(balance);
			break;
		case 4:
			balance=usr.balance(balance);
			break;
		case 5:
			usr.quit();
			break;
		default:
			System.out.println("Invalid choice..");
			System.out.println("Please enter valid choice ");
			functionalities();
		}
	}
	public int withdraw(int b) {
		balance=b;
		System.out.println("Enter the amount you want to withdraw");
		int wd=input.nextInt();
		try {
		if(wd>balance) {
			System.out.println("You have insufficient balance in your account to withdraw");
		}
		else if(wd<=balance) {
			balance=balance-wd;
			System.out.println("Withdrawl is successful at "+ctime);
		}
		}catch(Exception e) {
			
		}
		functionalities();
		return balance;
	}
	public int deposit(int b) {
		balance=b;
		System.out.println("Enter the amount you want to deposit");
		int dp=input.nextInt();
		try {
		if(dp<100000) {
		balance=balance+dp;
		System.out.println("Deposit is sucessfull at "+ctime );
		System.out.println("Your current balance is"+balance);
		}
		else {
			System.out.println("Can't deposit more than 1 lakh");
		}
		}catch(Exception e) {
			
		}
		functionalities();
		return balance;
	}
	public int transfer(int b) {
		balance=b;
		String to_acc;
		int tamount;
		System.out.println("Enter the user you want to transfer amount");
		to_acc=input.next();
		System.out.println("Enter the amount to transfer");
		tamount=input.nextInt();
		try {
		balance=balance-tamount;
		System.out.println("Transaction successful");
		}catch(Exception e) {
			
		}
		functionalities();
		return balance;
	}
	public int balance(int b) {
		balance=b;
		System.out.println("Your current balance is"+balance);
		functionalities();
		return balance;
	}
	public void quit() {
		System.out.println("Thank you...");
	}
}


