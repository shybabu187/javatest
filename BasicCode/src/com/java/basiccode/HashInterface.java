package com.java.basiccode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Non generic way 
		
		/*Map map =new HashMap();
		map.put(1,"Shyam");
		map.put(2,"Babu");
		
		Set set =map.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Map.Entry entry=(Entry) itr.next();
			
			System.out.println("key is "+entry.getKey()+" and valoue is  "+entry.getValue());
		}*/
		
		
	//Generic way 
		
	Map<Integer, String> map=new HashMap<>();
	map.put(1,"Babu");
	map.put(2,"shyam");
	map.put(2,"Mr");
	
	
	//map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));

	System.out.println(	map.keySet());
	System.out.println(map.values());
	
	
	for(Map.Entry m :map.entrySet())
	{
		System.out.println(m.getKey() +""+m.getValue());
	}
	
	System.out.println(map);
	
	
	System.out.println(map.getOrDefault(1,"not avalable "));
	System.out.println(map.getOrDefault(4,"not avalable "));
	
		
	}

}
