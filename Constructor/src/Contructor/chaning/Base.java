package Contructor.chaning;

public class Base {
	// Java program to illustrate Constructor Chaining to
	// other class using super() keyword
		String name;

		// constructor 1
		protected Base()
		{
			this("");
			System.out.println("No-argument constructor of" + 
											" base class");
		}

		// constructor 2
		Base(String name)
		{
			this.name = name;
			System.out.println("Calling parameterized constructor"
												+ " of base");
		}
	}

	class Derived extends Base
	{
		// constructor 3
		Derived()
		{
			System.out.println("No-argument constructor " + 
							"of derived");
		}

		// parameterized constructor 4
		Derived(String name)
		{
			// invokes base class constructor 2
			super(name);
			System.out.println("Calling parameterized " + 
							"constructor of derived");
		}

		
	}



