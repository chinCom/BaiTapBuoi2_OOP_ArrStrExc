package BTString_Array_Exception;

import java.util.Scanner;

public class Bai5 {
	private Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bai5().count_ch();
	}

	public int count_ch() {
		scanner = new Scanner(System.in);
		System.out.println("Input String: ");
		String string = scanner.nextLine();
		String ch = "ch";
		int count = 0;
		for (int i = 0; i < string.length() - 1; i++) {
			if (string.substring(i, i + 2).equals(ch)) {
				count++;
			}
		}
		System.out.println("Have: " + count + " character 'ch'");
		return count;
	}

}
