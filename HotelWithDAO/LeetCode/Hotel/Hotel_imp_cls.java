package Hotel;

import java.util.Scanner;

public class Hotel_imp_cls implements HotelInterface
{
	int qty1,qty2,qty3,qty4,qty5;
    Scanner sc= new Scanner(System.in);
	@Override
	public void addOrder() 
	{
		boolean b=true;
		while(b) {
			System.out.println("1. Idly Price=35\n2. Dosa Price=50\n3. Gobi Price=55");
		    System.out.println("4. Puri Price=35\n5. Rice Price=50\n6. Exit");
		    System.out.println("Enter your Choice");
		    int ch=sc.nextInt();
		    switch(ch) {
		    case 1:
		    	System.out.println("How Many Plate?");
				int qty1=sc.nextInt();
				this.qty1+=qty1;
				System.out.println(qty1+" plate of Idly Ordered");
				break;
		    case 2:
		    	System.out.println("How Many Plate?");
				int qty2=sc.nextInt();
				this.qty2+=qty2;
				System.out.println(qty2+" plate of Dosa Ordered");
				break;
		    case 3:
		    	System.out.println("How Many Plate?");
				int qty3=sc.nextInt();
				this.qty3+=qty3;
				System.out.println(qty3+" plate of Gobi Ordered");
				break;
		    case 4:
		    	System.out.println("How Many Plate?");
				int qty4=sc.nextInt();
				this.qty4+=qty4;
				System.out.println(qty4+" plate of Puri Ordered");
				break;
		    case 5:
		    	System.out.println("How Many Plate?");
				int qty5=sc.nextInt();
				this.qty5+=qty5;
				System.out.println(qty5+" plate of Rice Ordered");
				break;
		    case 6:
		    	b=false;
		    }
		}
	}

	@Override
	public void bill(UserDetails ref) 
	{
		System.out.println("Bill...");
		System.out.println("========");
		System.out.println("Customer Name:- " +ref.getName());
		System.out.println("Customer Mobile No.:- "+ref.getContact());
		System.out.println("---------------------------------------------------------------");
		System.out.println(" ITEM       |          PRICE            |       QTY  ");
		System.out.println("---------------------------------------------------------------");
		int a=0;
		if(this.qty1>0)
		{
		a++;
		System.out.println(a+"."+"Idly      |          Rs 35/plate      |       "+this.qty1);
		}
		if(this.qty2>0)
		{
		a++;
		System.out.println(a+"."+"Dosa      |          Rs 50/plate      |       "+this.qty2);
		}
		if(this.qty3>0) {
			a++;
		System.out.println(a+"."+"Gobi      |          Rs 55/plate      |       "+this.qty3);
		}
		if(this.qty4>0) {
			a++;
		System.out.println(a+"."+"Rooms     |          Rs 30/plate      |       "+this.qty4);
		}
		if(this.qty5>0) {
			a++;
		System.out.println(a+"."+"Rooms     |          Rs 50/plate      |       "+this.qty5);
		}
		double b=(35*this.qty1)+(50*this.qty2)+(55*this.qty3)+(30*this.qty4)+(50*this.qty5);
		System.out.println();
		System.out.println("   Total bill without GST                      "+b);
		System.out.println("GST 18%");
		double b1=((((35*this.qty1)+(50*this.qty2)+(55*this.qty3)+(30*this.qty4)+(50*this.qty5))*18)/100)+b;
		System.out.println();
		System.out.println("   Total bill with GST                         "+b1);
		
		System.out.println("---------------------------------------------------------------");
	}
		
		
	

}
