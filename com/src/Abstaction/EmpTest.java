package Abstaction;

public class EmpTest {
	public static void main(String...A) {
		Emp e1=new Emp1("Arvind");
		Emp e2=new Emp2("Sumit");
		Emp e3=new Manager("Sujal");
		e3.work();
		//e3.Extracarriculum();
		e1.work();
		
		e1.Extracarriculum();
		e2.work();
		e2.Extracarriculum();
	}

}
