package custom;

import java.util.*;

public class TreeMap 
{
	public static void main(String[] args) 
	{
		Map <city,Emp> c= new LinkedHashMap<>();
		
		c.put(new city("bengalore"), new Emp("Arvind"));
		c.put(new city("bhopal"), new Emp("sumit"));
		c.put(new city("Mysore"), new Emp("rohit"));
		c.put(new city("indore"), new Emp("sujal"));
		c.put(new city("mumbai"), new Emp("kunal"));
		
        Set<city> allkey=c.keySet() ;
		
		for(city key:allkey)
		{
			
			Emp val=c.get(key);
			System.out.println(key+" "+val);
		}
		
		
	}

}
