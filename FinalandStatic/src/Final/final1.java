package Final;


public class final1 {	

		 static void firstName()
		{

			System.out.println("Mayank");
		}

		
		 static final void surName()
		{

			System.out.println("Trivedi");
		}
	


//class C extends final1 {

		// Method 1
		// Trying to override the last name
//		public void surName()    //Final method can't be override
//		{
//			// Display surname
//			System.out.println("Sharma");
//		}

		// Method 2
		// Main driver method
		public static void main(String[] args)
		{

			// Display message
			firstName();
			surName();
			System.out.println("GFG");
		}
	}



