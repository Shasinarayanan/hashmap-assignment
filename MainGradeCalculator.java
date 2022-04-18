package com.hashmapassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int no_of_students = scanner.nextInt();
		Map<String,Float> studentdetails = new HashMap<String, Float>();
		for (int i = 0; i < no_of_students; i++) {
		String name = scanner.next();
		Float marks = scanner.nextFloat();
		studentdetails.put(name, marks);
		
		}
		System.out.println(UserMainCodeGradeCalculator.getstring(studentdetails));
	}

}
