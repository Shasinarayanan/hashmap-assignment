package com.hashmapassignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class UserMainCodeGradeCalculator 
{
 public static Map<String,String>getstring(Map<String,Float> studentdetails)
 {
	 Map<String,String>resultedgrades=new HashMap<String,String>();
	 Iterator<String> it = studentdetails.keySet().iterator();
	 while (it.hasNext()) {
	 String marks_storage = it.next();
	 Float mark = studentdetails.get(marks_storage);
	 if (mark >= 60) 
		 resultedgrades.put(marks_storage, "PASS");
	 else if(mark < 60)
		 resultedgrades.put(marks_storage, "FAIL");
	 else 
		 resultedgrades.put(marks_storage, "FAIL");
	 }
	return resultedgrades;
	 
 }
 
}
