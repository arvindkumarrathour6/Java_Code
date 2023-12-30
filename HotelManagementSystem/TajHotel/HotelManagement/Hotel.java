package HotelManagement;

import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
	String name;
	long M_number;
	int room_no,day,how_many_day;
	int qty,qty1,qty2;
	public Hotel(Scanner sc)
	{
		System.out.println("WELCOME TO TAJ HOTEL");
		System.out.println("========================");
		while (true) 
		{
		 System.out.println("1. Make Registration");
	     System.out.println("2. View Registration");
	     System.out.println("3. Exit");
	     System.out.println ("Enter your choice: ");
	     
	     int ch=sc.nextInt();
	     if (ch==1)
	     {
	    	 System.out.println("Make Registration :");
	    	 System.out.println("------------------");
	    	 this.MakeRegistration(sc);
	    	 System.out.println("Registration Done Successfully...");
	     }
	     else if(ch==2)
	     {
	    	 System.out.println("View Registration :");
	    	 System.out.println("------------------");
             this.ViewRegistration();
	     }
	     else if(ch==3)
	     {
	    	 if(M_number==0)
	    	 {
	    		 this.exit();
	    	 }
	    	 else
	    	 {
	    		 this.usehotel(sc);
	    		 System.out.println();
	        	  System.out.println();
	     	  System.out.println("THANKS FOR COMING TAJ!!!");
	    	 }
	    	 break;
	     }
	     else
	     {
	    	 System.out.println("Invalid Input... Try Again!!! ");
	     }
	  }

	}
	public void MakeRegistration(Scanner sc)
	{
		System.out.println("Enter Customer Name:- ");
		this.name=sc.next();
		System.out.println("Enter Customer Mobile No.:- ");
		this.M_number=sc.nextInt();
		System.out.println("Do you want to Room for Stay?");
		System.out.println("Enter your Choice (YES/NO) :-");
		String s=sc.next();
		if(s.equalsIgnoreCase("yes"))
		{
			this.Room(sc);
		}
		
	}
	void ViewRegistration()
	{
		System.out.println("Customer Name:- "+this.name);
		System.out.println("Customer Mobile No.:- "+this.M_number);
		System.out.println("Your Room Number :-"+this.room_no);
	}
	void Room(Scanner sc) 
	{
		System.out.println("Book Room");
		System.out.println("Room rent for one_day&night Rs500");
		System.out.println("Enter How many day you want to Stay");
		int day =sc.nextInt();
		this.how_many_day=day;
		System.out.println("Available Room Number :");
		int[]room={101, 102, 202, 220};
		System.out.println(Arrays.toString(room));
		System.out.println("Enter Room Number:- ");
		this.room_no=sc.nextInt();
//		int room1=this.room_no;
//		for (int i=0; i<room.length;++i)
//		{
//			if(room[i]==this.room_no)
//			{
//				System.out.println("Room is aleady Book try another Room");
//			}
//			else
//			{
//				break;
//			}
//		}
		
	}
	void exit()
	{
		System.out.println();
     	  System.out.println();
  	  System.out.println("THANKS FOR COMING TAJ!!!");
	}
	void bill()
	{
		System.out.println("Bill...");
		System.out.println("---------");
		System.out.println("Customer Name:- " +this.name);
		System.out.println("Customer Mobile No.:- "+this.M_number);
		System.out.println("Room Number :- "+this.room_no);
		System.out.println("     ITEM                  PRICE                   QTY    ");
		System.out.println("-------------------------------------------------------------");
		int a=0;
		if(this.qty>0)
		{
		a++;
		System.out.println(a+"."+"Roti                  Rs 10/pc               "+this.qty);
		}
		if(this.qty1>0)
		{
		a++;
		System.out.println(a+"."+"Gobhi Manchurian      Rs 50/plate            "+this.qty1);
		}
		if(this.qty2>0) {
			a++;
		System.out.println(a+"."+"Fried Rice            Rs 70/plate            "+this.qty2);
		}
		if(this.room_no>0) {
			a++;
		System.out.println(a+"."+"Rooms                 Rs 500/day&night       "+this.how_many_day+"day");
		}
		double b=(10*this.qty)+(50*this.qty1)+(70*this.qty2)+this.how_many_day*500;
		System.out.println("   Total bill without Tax                        "+b);
		double b1=((((10*this.qty)+(50*this.qty1)+(70*this.qty2)+this.how_many_day*500)*18)/100)+b;
		System.out.println();
		System.out.println("   Total bill with Tax                           "+b1);
		
		
	}
	void menu(Scanner sc)
	{
		System.out.println("Menu Card...");
		System.out.println("--------------");
		System.out.println("1. Roti Rs 10/pc");
		System.out.println("2. Gobhi Manchurian Rs 50/plate");
		System.out.println("3. Fried Rice Rs 70/plate");
		System.out.println("4. Ordered place");
		
		while(true) 
		{
			System.out.println("Enter Your choice -");
			int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("How Many Roti?");
			int qty=sc.nextInt();
			this.qty+=qty;
			System.out.println("Number of Roties is Ordered - "+qty);
				
		}
		else if(ch==2)
		{
			System.out.println("How Many plates Gobhi Manchurian?");
			int qty1=sc.nextInt();
			this.qty1+=qty1;
			System.out.println("Number of plates Gobhi Manchurian is Ordered - "+qty1);
		}	
		else if(ch==3) 
		{
			System.out.println("How Many plates Fried Rice?");
			int qty2=sc.nextInt();
			this.qty2+=qty2;
			System.out.println("Number of plates Fried Rice is Ordered - "+qty2);
		}
		else
		{
			System.out.println("Your ordered place Thank you");
			this.usehotel(sc);
			break;
		}
		}
	}
	void usehotel(Scanner sc)
	{
		System.out.println("What would you like to do ?...");
		System.out.println("1. Add orders");
		System.out.println("2. Bill");
		System.out.println("Enter Choice:- ");
		int ch=sc.nextInt();
		if(ch==1)
		{
			this.menu(sc);
		}	
		else 
		{
			this.bill();
		}
	}
}
