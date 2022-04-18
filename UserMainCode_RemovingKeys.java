package com.hashmapassignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UserMainCode_RemovingKeys {
 public static int sizeOfResultedHashmap(Map<Integer, String> hashmap)
 {
	 int key,size_of_the_hashmap=0;
	 Iterator<Integer> it = hashmap.keySet().iterator();
	 while (it.hasNext()) {
	 key = it.next();
	 if(key%4!=0)
		 size_of_the_hashmap++;
	 }
	return size_of_the_hashmap;
	 
 }
}
