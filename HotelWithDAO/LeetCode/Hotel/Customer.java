package Hotel;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("           WelCome to Hotel");
		System.out.println("         ===================");
		System.out.println("Enter Customer Name:");
		String name= sc.next();
		System.out.println("Enter Customer Contact:");
		long cont= sc.nextInt();
		
		UserDetails ud=new UserDetails(name,cont);
		HotelFactory hf=new HotelFactory();
		HotelInterface hi= hf.creatInstace();
		while(true) 
		{
			System.out.println("What would you like to do ?...");
			System.out.println("1. Add orders");
			System.out.println("2. Bill\n3. Exit");
			System.out.println("Enter Choice:- ");
			int ch=sc.nextInt();
			if(ch==1)
			{
				hi.addOrder();
			}	
			else if(ch==2)
			{
				hi.bill(ud);
			}
			else {
				System.out.println("=======Thank You Visit Again=======");
				System.exit(0);
			}
		}
			
		
	}

}
