package com.hashmapassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainLargestKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		for (int i = 0; i < number; i++) {
			Integer id = scanner.nextInt();
			String name = scanner.next();
			hashmap.put(id, name);
		}

		
	
	System.out.println(UserMainCodeLargestKey.sizeOfResultedHashmap(hashmap));
	}

}
