package com.practice;

import java.util.Scanner;
import java.util.Stack;

public class Problem10 {

	private static String lpr = "{([";
	private static String rpr = "})]";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Stack<Character> opstack = new Stack<Character>();
	    
	      while (sc.hasNext()) {
	         String input=sc.next();
	         boolean isInvalid = false;
	         outer:  
	         for(char charInput : input.toCharArray()){
		         switch(charInput){
		         case '{': case'(':case'[':
		        	 opstack.push(charInput);
		        	 break;
		         case '}': case')': case']':
		        	 if(opstack.isEmpty()){
		        		 isInvalid = true;
		        		 break outer;
		        	 }
		        	 if(rpr.indexOf(charInput) != lpr.indexOf(opstack.pop()))
		        		 break outer;
		        	 break;
		         default: 
		        	 break;	 
		         }
	         }
	         if(opstack.isEmpty() && !isInvalid)
	        	 System.out.println("true");
	         else
	        	 System.out.println("false");
	         opstack.clear();
	      }
	}
}
