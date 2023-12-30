package cllone;

public class Student2 implements Cloneable
{
	int roll;
	Address1 address;
	protected Object clone() throws CloneNotSupportedException {
		Student2 s=(Student2) super.clone();
		s.address=(Address1) address.clone();
		return s;
		
	}
	
}