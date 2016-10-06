package chapter1;

import java.util.Scanner;


/**
 * Write a method to replace all spaces in a string with '%20'.
 *
 */
public class URLify {

	/**
	 * 
	 * @param s		Input string
	 * @return		The same string, but with spaces replaced with '%20'.
	 */
	public static String createURL(String s) {
		String[] words = s.split(" ");
		StringBuilder builder = new StringBuilder();
		for (String word : words) {
			builder.append("%20");
			builder.append(word);
		}
		builder.delete(0, 3);
		return builder.toString();
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
				System.out.println(createURL(input));
			}
		}

	}

}
