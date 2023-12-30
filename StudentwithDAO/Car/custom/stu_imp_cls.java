package custom;

import java.util.ArrayList;

public class stu_imp_cls implements StudentInterface
{
	ArrayList<Student> s= new ArrayList();
	@Override
	public ArrayList<Student> all_stu() 
	{
		return s;
	}

	@Override
	public void adding_stu(Student s1) {
		s.add(s1);
		
	}

	@Override
	public Student serachId(int id) {
		Student s2=null;
		for (Student s1:s) {
			if(id==s1.getid()) {
				s2=s1;
			}
		}
		return s2;
	}

	@Override
	public void Remove(int id) {
		for(Student s1: s) 
		{
			if ( s1.getid()==id) 
			{
				s.remove(Integer.valueOf(id));
				System.out.println(s1.getname()+" Details Remove Succesfully!");
				break;
			}
		}
		
	}

}
