package BankApp;
import java.util.Scanner;

public class Bank 
{
	public static void main(String[] args) 
	{
		BankFactory bf = new BankFactory();
		BankInterface bi = bf.createInstace();
		usebank(bi);
	}
	public static void usebank(BankInterface bi)
	{
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("    Yono SBI Bank");
			System.out.println("=======================");
			System.out.println("1. New Customer\n2. Existing Customer\n3. Exit");
			System.out.println("=======================");
			System.out.println("Enter your choice:");
			int ch1=sc.nextInt();
			switch(ch1) 
			{
			case 1:
				bi.NewCustomer();
				break;
			case 2:
				Bankc B=bi.ExistingCustomer();
				if(B!=null) {
					while(true) 
					{
						bi.choice();
						System.out.println("Enter your Choice:");
						
						int ch=sc.nextInt();
						switch(ch)
						{
						  case 1:
								bi.deposite(B);
								break;
						  case 2:
								bi.withdraw(B);
								break;
						  case 3:
							   bi.checkbalanace(B);
							   break;
						  case 4:
							   bi.MyAccount(B);
							   break;
						  case 5:
							  boolean b1= bi.updatepin(B);
							  if(!b1)
							  {
								  System.out.println("Attempt Over\n"
								  		+ "Try After Some Time Else Contact the Bank\n"
								  		+ "========Log Out======== ");
							  }
							  usebank(bi);
							  break;
						  case 6:
							  System.out.println("========Log Out========");
							  usebank(bi);
						  default:
							  System.err.println("You Enter wrong Choice...\ntry again....");
						 }
					}
				}
				else
				{
					System.err.println("Account isn't Exist\nTry Again....");
				}
				break;
			case 3:
				  System.out.println("========Thank you Visit again========");
				  System.exit(0);
			default:
				  System.err.println("You Enter wrong Choice...\ntry again....");
		   }	
		 }
	}
}

