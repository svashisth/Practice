package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		
		if(n <0 || n > 100000)
			return;
		
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			phoneBook.put(name.toLowerCase(), phone);
			in.nextLine();
		}
		
		List<String> input = new ArrayList<String>();
		while (in.hasNext()) {
			input.add(in.nextLine());
			if(input.size() > 100000) break;
		}
		
		for(String entry : input){
			System.out.println(entry+"="+phoneBook.get(entry.toLowerCase()));
		}
		
	}
}
