package Arrays;


import java.util.Scanner;


public class workspace1 {
	
	long acc;
	String name;
	int pin;
	double bal;
	public workspace1(Scanner sc)
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
	String[] ch= {"1. Deposit","2. Withdaw","3. CheckBalance","4. UpdatePin","5. Exit"};
	void displayOption() {
		//String[] ch= {"1. Deposit","2. Withdaw","3. CheckBalance","4. UpdatePin","5. Exit"};
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println(ch[4]);
	}
	void UseBank(Scanner sc)
	{
		int c=1;
		if(c<=3)
		{
			System.out.println("Verifieing the account details....");
			this.CheckAccountno(sc);
			this.CheckName(sc);
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
				int ch1=sc.nextInt();
				switch(ch1)
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
		long CheckAccountno(Scanner sc) {
			long acc=0;
			while(acc!=this.acc) {
				System.out.println("Enter Account no..");
				int acc1=sc.nextInt();
				acc=acc1;
				if(acc!=this.acc) {
					System.out.println("Incorrect Account no Try again!!!");
				}
			
			}
			return acc;

	}
		String CheckName(Scanner sc) {
			String name1="null";
			while(!this.name.equals(name1)) {
				System.out.println("Enter your name..");
				String name2=sc.next();
				name1=name2;
				if(!this.name.equals(name1)) {
					System.out.println("Incorrect Name Try again!!!");
				}
			
			}
			return name;
}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			workspace1 b1= new workspace1(sc);
			b1.UseBank(sc);
			
			
			
		}
}



