package Basic;

 interface inf1 
{
  int k=10;
}
 interface inf2
 {
	 int k=20;
 }
 public class Ex1 implements inf1 , inf2
 {
	 public static void main(String[] args) {
		 Ex1 e = new Ex1();
		System.out.println(e.k);
	}
 }
