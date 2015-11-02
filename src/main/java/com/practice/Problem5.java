package com.practice;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse
 * @author AD79272
 *
 */
public class Problem5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        /*
        A = A.trim();
        int length = A.length();
        boolean success = true;
		for(int i = 0; i < length / 2 ; i++){
        	if( A.charAt(i) != A.charAt((length-1)-i) ){
        		success = false;
        		break;
        	}
        }
		
		if(success) System.out.println("Yes");
		else System.out.println("No");
		*/
        
        System.out.println((new StringBuilder(A)).reverse().toString().equalsIgnoreCase(A) ? "Yes" : "No");
	}
}
