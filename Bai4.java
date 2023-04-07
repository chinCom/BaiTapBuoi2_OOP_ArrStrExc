package BTString_Array_Exception;

import java.util.Scanner;

public class Bai4 {

	private Scanner scanner;

	public static void main(String[] args) {
		new Bai4().getString();
	}

	public void getString() {
		scanner = new Scanner(System.in);
		System.out.println("Input String: ");
		String string = scanner.nextLine();

		int countUpperCase = 0, countLowerCase = string.length(), countNum = 0, countSpace = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isUpperCase(string.charAt(i))) {
				countUpperCase++; // count upper case
			}
//			if (Character.isLowerCase(string.charAt(i))) {
//				countLowerCase++;
//			}

			if (Character.isDigit(string.charAt(i))) {
				countNum++;
			}
			if (string.charAt(i) == ' ') {
				countSpace++;
			}
		}
		countLowerCase -= (countUpperCase + countSpace + countNum);

		System.out.printf("String have %d upper letter, %d lower case, %d numbers, %d white space", countUpperCase,
				countLowerCase, countNum, countSpace);
		// Hello, World! 123
	}

}
