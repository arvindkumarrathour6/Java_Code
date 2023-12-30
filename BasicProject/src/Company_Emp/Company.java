package Company_Emp;

public class Company {
	String cname;
	Employee E;
	
	public Company(String cname) {
		this.cname=cname;
	}
	 public void get_hired(Employee E) {
		System.out.println(cname+" Company hire "+ E.ename);
	}

}
