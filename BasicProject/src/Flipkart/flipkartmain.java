package Flipkart;

public class flipkartmain {
	public static void main(String[] arg)
	{
		Electronic e =new Electronic("Sumsung s23",1000000,4);
		
		e.addtoCart();
		e.displayproduct();
		e.makepayment();
        Cloths c =new Cloths("jeans",1000,4);
		System.out.println();
		c.addtoCart();
		c.displayproduct();
		c.makepayment();
	}
 
}
