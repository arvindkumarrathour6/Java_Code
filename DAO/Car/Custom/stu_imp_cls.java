package Custom;

public class stu_imp_cls implements StudentInterface
{
    Student[] s= new Student[2];
    int index=0;
	@Override
	public Student[] all_stu() 
	{
		
		return s;
	}

	@Override
	public void adding_stu(Student s1) {
		s[index]=s1;
		index++;
		
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

}
