package chapter1;

import java.util.Scanner;

/**
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check
 * if they are one edit (or zero edits) away.
 *
 */
public class OneAway {

	
	public static boolean checkOneAway(String s1, String s2) {
		if (s1.length() == s2.length())
			return checkReplace(s1, s2);
		else if (s1.length() == s2.length() + 1)
			return checkInsertRemove(s2, s1);
		else if (s1.length() == s2.length() - 1)
			return checkInsertRemove(s1, s2);
		else
			return false;
	}
	
	private static boolean checkInsertRemove(String s1, String s2) {
		boolean foundDiff = false;
		
		for (int i = 0; i < s2.length(); i++) {
			if (i >= s1.length()) break;
			if (foundDiff) {
				if (s1.charAt(i-1) != s2.charAt(i)) {
					return false;
				}
			}
			else if (s1.charAt(i) != s2.charAt(i)) {
				foundDiff = true;
			}
		}
		return true;
	}
	
	private static boolean checkReplace(String s1, String s2) {
		int countDifferences = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) countDifferences++;
		}
		if (countDifferences == 1) return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.print("Enter a string (q to quit): ");
			String s1 = sc.nextLine();
			if (s1.equals("q")) return;
			System.out.print("Enter another string: ");
			String s2 = sc.nextLine();
			System.out.println(checkOneAway(s1, s2));
		}
	}

}
