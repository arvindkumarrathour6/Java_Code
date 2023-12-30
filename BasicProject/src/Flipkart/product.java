package Flipkart;

public class product {
	String name;
	double price;
	int qty;
	
	void addtoCart()
	{
		System.out.println(this.qty+" "+this.name+" product is added");
		System.out.println("Total amount"+this.price*this.qty);
	}
	void makepayment()
	{
		System.out.println(this.qty*this.price+" Payment done");
	}
	void displayproduct()
	{
		System.out.println("product name "+this.name);
		System.out.println("product price "+this.price);
	}

}

