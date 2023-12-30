package custom;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> hm=new HashMap<>();
		hm.put(1, "Arvind");
		hm.put(2, "Rohit");
		hm.put(3, "Raushan");
		hm.put(4, "kunal");
		hm.put(5, "Sumit");
		
		Set<Integer> allkey= hm.keySet() ;
		
		for(Integer key:allkey)
		{
			
			String val=hm.get(key);
			System.out.println(key+":"+val);
		}
		Set<Map.Entry<Integer, String>> entry=hm.entrySet();
		for(Map.Entry<Integer, String> var:entry)
		{
			//System.out.println(var);
			Integer key=var.getKey();
			String  val=var.getValue();
			System.out.println(key+":"+val);
		}
		
	}

}
