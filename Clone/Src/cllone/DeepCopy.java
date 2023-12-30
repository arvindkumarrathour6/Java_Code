package cllone;

public class DeepCopy 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
		Student2 s= new Student2();
		s.roll=10;
		Address1 address= new Address1();
		address.id=22;
		s.address=address;
		Student2 s1 = (Student2) s.clone();
		s1.roll=20;
		s1.address.id=112;

		System.out.println(s.roll);
		System.out.println(s1.roll);
		System.out.println(s.address.id);
		System.out.println(s1.address.id);
	}
}
