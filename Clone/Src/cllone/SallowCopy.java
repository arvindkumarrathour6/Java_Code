package cllone;

class Address{
	int id;
}
class Student implements Cloneable
{
	int roll;
	Integer per;
	Address address;
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
}
public class SallowCopy 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
		Student s= new Student();
		s.roll=10;
		Address a= new Address();
		s.address=a;
		Student s1 = (Student) s.clone();
		s1.roll=20;
		a.id=112;
		
		s1.address.id=11;
		System.out.println(s.roll);
		System.out.println(s1.roll);
		System.out.println(s.address.id);
		System.out.println(s1.address.id);
	}
}

