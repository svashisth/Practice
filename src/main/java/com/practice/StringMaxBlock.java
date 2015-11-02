package com.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * http://codingbat.com/prob/p179479
 * @author AD79272
 *
 */
public class StringMaxBlock
{

	/**
	 * Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same. 
		maxBlock("hoopla") > 2
		maxBlock("abbCCCddBBBxx") > 3
		maxBlock("") > 0
	 * @param args
	 */
	public static void main(String[] args)
	{
//		System.out.println(maxBlock("hoopla"));
//		System.out.println(maxBlock("abbCCCddBBBxx"));
//		System.out.println(maxBlock("XXBBBbbxxXXXX"));
		
//		System.out.println(sumNumbers("XX2BBbb22XXXX"));
//		System.out.println(sumNumbers("abc123xy1z"));
//		System.out.println(sumNumbers("aa11b33"));
//		System.out.println(sumNumbers("7 11"));
		
		System.out.println(countYZ("fez day"));
		System.out.println(countYZ("!!day--yaz!!"));
		System.out.println(countYZ("day:yak"));
	}
	
	public static int maxBlock(String str) {
		if(str.isEmpty()) return 0;
		int lastHigh = 0;
		int count = 0;
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == str.charAt(i-1))
				count++;
			else{
				if(count > lastHigh)
					lastHigh = count;
				count = 0;
			}
		}
		if(count > lastHigh)
			lastHigh = count;
		return lastHigh+1;
	}

	public static int sumNumbers(String str) {
		List<String> numList = new ArrayList<String>();
		StringBuilder pNum = new StringBuilder("");
		  for(int i =0; i< str.length(); i++){
			  char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				  pNum.append(ch);
			  }else{
				  if(!pNum.toString().isEmpty())
					  numList.add(pNum.toString());
				  pNum.setLength(0);
			  }
		  }
		  if(!pNum.toString().isEmpty())
			  numList.add(pNum.toString());
	  return sumNumbersInList(numList);
	}

	private static int sumNumbersInList(List<String> numList)
	{
		int sum = 0;
		for(String num : numList){
			sum += Integer.parseInt(num);
		}
		return sum;
	}
	
	public static int countYZ(String str) {
		String[] words = str.split("[^a-zA-Z]");
		int count = 0;
		for(String word : words){
			if(word.endsWith("y") || word.endsWith("z") || word.endsWith("Y") || word.endsWith("Z"))
				count++;
		}
		return count;
	}

}
