package site;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * https://www.hackerrank.com/challenges/java-string-compare
 * @author AD79272
 *
 */
public class Problem4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int stringSize = scanner.nextInt();
		TreeSet<String> set = new TreeSet<String>();
		for(int i = 0; i < string.length() - (stringSize-1); i++){
			String data = string.substring(i, i+stringSize);
			set.add(data);
		}
		System.out.println(set.first());
		System.out.println(set.last());
	}
}
