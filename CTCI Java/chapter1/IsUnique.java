package chapter1;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Implement an algorithm to determine if a string has all
 * unique characters.
 */
public class IsUnique {

	/**
	 * O(n) time, O(n) space
	 * 
	 * @param s		The input string
	 * @return		Whether or not the string contains
	 * 				unique characters
	 */
	public static boolean hasUniqueCharacters(String s) {
		Set<Character> charList = new HashSet<Character>();
		for (int i=0; i<s.length(); i++) {
			if (charList.contains(s.charAt(i))) 
				return false;
			charList.add(s.charAt(i));
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
			String input = sc.nextLine();
			if (input.equals("q")) return;
			else {
				System.out.println(hasUniqueCharacters(input));
			}
		}
	}

}
