package Custom;

public class Client 
{
	public static void main(String[] args) 
	{
	Student s1 = new Student("Arvind",1);
	Student s2 = new Student("Sumit",2);
	
	StudentFactory sf = new StudentFactory();
	
	StudentInterface si = sf.createInstance();
	
	si.adding_stu(s1);
	si.adding_stu(s2);
	
	Student[] s = si.all_stu();
	for(Student s4:s)
	{
	    System.out.println("Student_id "+s4.getid()+" Student_name "+s4.getname());
	}
	Student s5=si.serachId(10);
	if(s5==null)
	{
		System.err.println("Id not Found");
	}
	else
	{
		System.err.println("Id Found");
	}

	}
}
