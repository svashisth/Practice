package com.practice;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-strings-introduction
 * 
 * @author AD79272
 *
 */
public class Problem3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		int length = (A + B).length();
		System.out.println(length);
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		System.out.println(A.substring(0, 1).toUpperCase()
				.concat(A.substring(1))
				+ " " + B.substring(0, 1).toUpperCase().concat(B.substring(1)));
	}

}
