package com.practice;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        
        if(s.length() > 400000)
        	return;
        
        if(s.length() == 0){
        	System.out.println("0");
        	return;
        }
        String[] strings = s.trim().split("['\\s]+");
        
        System.out.println(strings.length);
        
        for(String str : strings){
        	System.out.println(str.replaceAll("[^\\s\\w]*", ""));
        }
	}
}
