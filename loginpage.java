
	import java.io.*;
	import java.util.*;
	import java.text.DecimalFormat; 
	public class loginpage extends Transactions {
		Scanner input=new Scanner(System.in);
		DecimalFormat money=new DecimalFormat("'$'###,##0.00");
		HashMap <String,Integer> data=new HashMap<String,Integer>();
		Transactions usr=new Transactions();
		String user;
		int pin;
		public int logmeth() {
			int x=1;
			do {
				try {
				data.put("Sreya", 868899);
				data.put("Raji", 778026);
				System.out.println("WELCOME TO ATM INTERFACE.....");
				System.out.println("Please enter user name..");
				String usr=this.user=input.next();
				System.out.println("Enter your pin..");
				this.pin=input.nextInt();
				}catch(Exception e) {
					System.out.println("Invalid characters..");
					x=2;
				}
				if(data.containsKey(this.user)&& data.get(this.user)==this.pin){
					System.out.println("Valid login...");
					System.out.println("You can perform your transactions");
					usr.functionalities();
				}
				else {
					System.out.println("Invalid login details");
				}
		}while(x==1);
		return 0;
		}
	}


