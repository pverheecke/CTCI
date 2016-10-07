package chapter1;

import java.util.Scanner;

/**
 * Assume you have a method isSubstring which checks if one word is
 * a substring of another. Given two strings, s1 and s2, write code to
 * check if s2 is a rotation of s1 using only one call to isSubstring
 * (e.g. "waterbottle" is a rotation of "erbottlewat").
 *
 */
public class StringRotation {

	
	public static boolean isRotation(String s1, String s2) {
		return (s1.length() == s2.length() && ((s1+s1).indexOf(s2) != -1));
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
			System.out.println(isRotation(s1, s2));
		}
	}

}
