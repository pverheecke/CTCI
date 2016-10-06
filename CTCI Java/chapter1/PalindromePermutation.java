package chapter1;


import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just
 * dictionary words.
 *
 */
public class PalindromePermutation {
	
	
	public static boolean isAPalindromePermutation(String s) {
		s = s.replaceAll("\\s", "");
		
		boolean hasEvenChars = false;
		if (s.length() % 2 == 0) hasEvenChars = true;
		
		Map<Character, Integer> charList = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			charList.put(s.charAt(i), charList.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		int numOdds = 0;
		for (int i = 0; i < s.length(); i++) {
			if (charList.get(s.charAt(i)) % 2 != 0) {
				numOdds++;
			}
			if (hasEvenChars && numOdds > 0) return false;
			else if (!hasEvenChars && numOdds > 1) return false;
		}
		if (!hasEvenChars && numOdds == 0) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.print("Enter a string (q to quit): ");
			String input = sc.nextLine();
			if (input.equals("q")) return;
			else {
				System.out.println(isAPalindromePermutation(input));
			}
		}
	}

}
