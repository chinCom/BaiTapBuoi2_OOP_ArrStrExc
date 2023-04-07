package BTString_Array_Exception;

import java.util.Random;
import java.util.Scanner;

public class Bai6 {
	Scanner scanner;
	boolean check = false;

	// contructor, initialization scanner
	public Bai6() {
		scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bai6().game();
	}

	public void game() {
		guess();
		String playContinueString = "";
		scanner.nextLine();
		while (!check) {
			System.out.println("Do you want to play again ? if yes say 'y' otherwise 'n'");
			playContinueString = scanner.nextLine();
			if (playContinueString.equals("y")) {
				guess();
			} else {
				check = false;
			}
		}

	}

	public void guess() {
//		scanner = new Scanner(System.in);
		int rn = 0;
		Random random = new Random();
		rn = random.nextInt(100);
		int guess;
		int i = 0;
		while (i < 7) {
			try {
				System.out.println("your guess: ");
				guess = scanner.nextInt();
				System.out.println(rn);
				if (guess == rn) {
					System.out.println("Conrgatulation! you guess correct");
					check = true;
					break;
				} else if (guess < rn) {
					System.out.println("can you guess another greater number");
				} else if (guess > rn) {
					System.out.println("can you guess another smaller number");
				}
				i++;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid value! Idiot");
				scanner.nextLine();
			}

		}
	}

}
