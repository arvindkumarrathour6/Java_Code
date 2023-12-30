package Bank;
import java.util.Scanner;
public class Bank {
	long acc;
	String name;
	int pin;
	double bal;
	public Bank(Scanner sc)
	{    
		System.out.println("Welcome to Bank!!!");
		System.out.println("-------------------");
		System.out.println("Enter an account number :");
		this.acc=sc.nextInt();
		
		System.out.println("Enter your name :");
		this.name=sc.next();
		
		System.out.println("Enter your ATM pin :");
		this.pin=sc.nextInt();
		System.out.println("Pin successfully Created!!!");
	
	}
	
	void deposite(double balance)
	{
		this.bal+=balance;
		System.out.println("Deposit amount is : "+balance);
		System.out.println(balance+"rs Amount is credited successfully.... ");
		
	}
	
	double withdraw(double balance)
	{
		if(bal<=this.bal) {
			
		this.bal-=balance;
		System.out.println("Withdraw  amount is : "+balance);
		System.out.println(balance+" Amount is debited successfully.... ");
		}
		else
		{
			System.out.println("Insufficient Balance....");
		}
		return bal;
	}

	void CheckBalance()
	{
		System.out.println("your Account Current Balance is : "+this.bal);
		
	}
	int UpdatePin(Scanner sc)
	{
		System.out.println("Enter New Pin :");
		this.pin=sc.nextInt();
		System.out.println("Pin Changed Successfully....");

		return this.pin;
		
	}
	void displayOption() {
		System.out.println("1. Deposiit");
		System.out.println("2. Withdaw");
		System.out.println("3. CheckBalance");
		System.out.println("4. UpdatePin");
		System.out.println("5. Exit");
	}
	void UseBank(Scanner sc)
	{
		int c=1;
		if(c<=3)
		{
			System.out.println("Verifieing the account details....");
			//this.CheckAccountno(sc);
			//1this.CheckName(sc);
			while(c<=3)
			{
				
     			System.out.println("Enter your atm Pin for using your account :");
				int pin1=sc.nextInt();
				if(this.pin==pin1 )
				{
				while(true)
				{
				System.out.println("Chose one of these :");
				this.displayOption();
			
				System.out.println("Enter your Choice!!!");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter ammount to deposit :");
					double d=sc.nextDouble();
					this.deposite(d);
					break;
				case 2:
					System.out.println("Enter ammount to withdraw :");
					double w=sc.nextDouble();
					this.withdraw(w);
					break;
				case 3:
					this.CheckBalance();
					break;
				case 4:
					this.UpdatePin(sc);
					break;
				case 5:
					System.out.println("Thanks for using Bank App!!!");
					System.exit(0);
					
				}
				}

				}
				else
				{
					System.out.println("you are entering wrong info.....");
					System.out.println("Please try again!!!");
				}
				c++;
			}
			this.UpdatePin(sc);
			this.UseBank(sc);
		}
	}
//		long CheckAccountno(Scanner sc) {
//			long acc=0;
//			while(acc!=this.acc) {
//				System.out.println("Enter Account no..");
//				int acc1=sc.nextInt();
//				acc=acc1;
//				if(acc!=this.acc) {
//					System.out.println("Incorrect Account no Try again!!!");
//				}
//			
//			}
//			return acc;
//
//	}
//		String CheckName(Scanner sc) {
//			String name1="null";
//			while(!this.name.equals(name1)) {
//				System.out.println("Enter your name..");
//				String name2=sc.next();
//				name1=name2;
//				if(!this.name.equals(name1)) {
//					System.out.println("Incorrect Name Try again!!!");
//				}
//			
//			}
//			return name;
//}
}



