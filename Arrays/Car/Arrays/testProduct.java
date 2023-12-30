package Arrays;

import java.util.Scanner;

public class testProduct {

	public static void main(String...A) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Quantity of Product");
		int p=sc.nextInt();
		ProductArray[] p1=new ProductArray[p];
		int a=1;
		for(int i=0;i<p1.length;i++) {
			ProductArray p2=new ProductArray(sc ,a++);
			p1[i]=p2;
			
		}
		System.out.println("ToTal number of product is:"+(a-1)+" & Product details:-");
		for(int i=0;i<p1.length;i++) {
			System.out.println(p1[i]);
		}
	}
}
