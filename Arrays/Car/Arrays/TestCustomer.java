package Arrays;

import java.util.ArrayList;

public class TestCustomer
{
	public static void main(String[] args) {
	Customer c1= new Customer();
	ArrayList<Customer> c=new ArrayList<>();
	c1.setId(1);
	c1.setCont(2434576);
	c1.setCity("bengaluru");
	
	c.add(c1);
	
	System.out.println(c);
	}

}
