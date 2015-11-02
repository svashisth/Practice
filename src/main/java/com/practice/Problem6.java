package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-anagrams
 * @author AD79272
 *
 */
public class Problem6 {

	static boolean isAnagram(String A, String B) {
		char[] charArrayA = A.toLowerCase().toCharArray();
		char[] charArrayB = B.toLowerCase().toCharArray();
		
		Arrays.sort(charArrayA);
		Arrays.sort(charArrayB);
				
		return Arrays.equals(charArrayA, charArrayB);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		
	}
}
