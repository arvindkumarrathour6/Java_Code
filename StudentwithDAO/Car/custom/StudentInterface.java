package custom;

import java.util.ArrayList;

public interface StudentInterface
{
	ArrayList<Student> all_stu();
	void adding_stu(Student s);
	Student serachId(int id);
	void Remove(int id);


}
