package Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel_imp implements HotelInterface
{
 
    Scanner sc = new Scanner(System.in);
	@Override
	public void menu(Hotel ref) {
		int [][]s=ref.getMenu();
		s[0][0]=30;
		s[1][0]=50;
		s[2][0]=35;
		s[3][0]=55;
		s[4][0]=20;
		
		ref.setMenu(s);
		for(int i=0;i<5;i++) {
			System.out.println(i+1+"." +" "+ref.name1[i]+" "+ ref.getPrice(i));
			}
		System.out.println("Select 6 for bill");
	}
	@Override
	public void bill(Hotel ref) {
		
		System.out.println("Item  Quantity  Price  Total") ;
		System.out.println("==================================================================") ;
		for(int i=0;i<5;i++) {
		if(ref.getQuantity(i)>0)
		System.out.println(ref.name1[i]+"        "+ref.getQuantity(i)+"       "+ ref.getPrice(i)+"       "+ref.getQuantity(i)*ref.getPrice(i)) ;
		}
		System.out.println("===================================================================") ;
				System.out.println("GST 18%");
				float total=0;
				for(int i=0;i<5;i++){
				total=total+(ref.getQuantity(i)* ref.getPrice(i));
				}
				System.out.println("cost          ="+total);
				float bill=total+(total*0.18f);
				System.out.println(" Total Bill   ="+bill) ;
	}
	@Override
	public void orderfood(Hotel ref,int c) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many plates?");
		int q=scan.nextInt();
		if(q<1) {
			System.out.println("no plate order");
		}
		else {
				int z=ref.getQuantity(c-1);
				z=z+q;
				ref.setQuantity(c-1, z);
				System.out.println(q+" Plates "+ref.name1[c-1]+" ordered");

		}
		

		
	}
	@Override
	public void Bookroom() {
		// TODO Auto-generated method stub
		
	}
	
}
