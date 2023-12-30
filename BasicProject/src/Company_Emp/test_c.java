package Company_Emp;

public class test_c {
	public static void main(String[] arg) {
		Company c=new Company("Tcs");
		Company c1=new Company("infosys");
		Company c2=new Company("wipro");
		
		Employee e=new Employee("Arvind");
		Employee e1=new Employee("Sujal");
		Employee e2=new Employee("sumit");
		c.get_hired(e);
		c1.get_hired(e1);
		c2.get_hired(e2);
		
	}

}
