package cllone;

 class Student1 {
	int roll;

}
 public class CopyOfobject{
	 public static void main(String[] args) {
		Student1 s=new Student1();
		s.roll=10;
		Student1 s1=s;
		s.roll=20;
		System.out.println(s.roll);
		System.out.println(s1.roll);
	}
 }
