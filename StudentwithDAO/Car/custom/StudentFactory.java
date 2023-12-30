
package custom;

public class StudentFactory 
{
	public StudentInterface createInstance()
	{
		return new stu_imp_cls();
	}

}
