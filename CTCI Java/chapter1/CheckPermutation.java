package chapter1;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


/**
 * Given two strings, write a method to decide if one is
 * a permutation of the other.
 *
 */
public class CheckPermutation {
	
	/**
	 * 
	 * @param s1	The first string to compare
	 * @param s2	The second string to compare
	 * @return		Whether or not s1 and s2 are permutations of each other
	 */
	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		Map<Character, Integer> charList = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			Integer currInt = charList.getOrDefault(s1.charAt(i), 0);
			charList.put(s1.charAt(i), currInt + 1);
		}
		for (int i = 0; i < s2.length(); i++) {
			Integer currInt = charList.getOrDefault(s2.charAt(i), 0);
			if (currInt == 0) return false;
			charList.put(s2.charAt(i), currInt - 1);
		}
		return true;
	}
	
	/**
	 * Test via user input
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.print("Enter a string (q to quit): ");
			String s1 = sc.nextLine();
			if (s1.equals("q")) return;
			System.out.print("Enter another string: ");
			String s2 = sc.nextLine();
			System.out.println(isPermutation(s1, s2));
		}

	}

}
