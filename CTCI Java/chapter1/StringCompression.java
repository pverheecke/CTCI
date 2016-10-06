package chapter1;

import java.util.Scanner;

/**
 * Implement a method to perform basic string compression using the counts of
 * repeated characters. For example, the string aabcccccaaa would become a2b1c5a3.
 * If the "compressed" string would not become smaller than the original string, 
 * your method should return the original string. You can assume the string has only
 * uppercase and lowercase letters (a-z).
 *
 */
public class StringCompression {

	/**
	 * 
	 * @param s		Input string
	 * @return		Compressed version of s
	 */
	public static String compressString(String s) {
		StringBuilder builder = new StringBuilder();
		char currChar = s.charAt(0);
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == currChar) {
				count++;
			} else {
				builder.append(currChar);
				builder.append(count);
				currChar = s.charAt(i);
				count = 1;
			}
		}
		builder.append(currChar);
		builder.append(count);
		String retStr = builder.toString();
		return retStr.length() < s.length() ? retStr : s;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.print("Enter a string (q to quit): ");
			String input = sc.nextLine();
			if (input.equals("q")) return;
			else {
				System.out.println(compressString(input));
			}
		}

	}

}
