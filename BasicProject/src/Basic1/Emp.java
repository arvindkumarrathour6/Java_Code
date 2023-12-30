package Basic1;

public class Emp {
	String name;
	String designation;
	long salary;
	Emp (String name,String designation,long salary)
	{
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	Emp(Emp other_Emp)
	{
		this.name=other_Emp.name;
		this.designation=other_Emp.designation;
		this.salary=other_Emp.salary;
	}
	public static void main(String[] arg)
	{
		Emp e1=new Emp("Arvind","Software_engineer",600000l);
		System.out.println(e1.name+" "+e1.designation+" "+e1.salary);
		Emp e2=new Emp(e1);
		System.out.println(e2.name+" "+e2.designation+" "+e2.salary);
	}

}
