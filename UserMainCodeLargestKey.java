package com.hashmapassignment;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UserMainCodeLargestKey {

	public static String sizeOfResultedHashmap(Map<Integer, String> hashmap)
	 {
		
		int maxvalue = 0;
		String str=" ";
		Set<Integer>key=hashmap.keySet();
		for(Integer i : key)
		{
		    if(i>maxvalue )
		    {
		        maxvalue = i;
		        str = hashmap.get(i);
		    }
		}
		return str;
}
	
}

	