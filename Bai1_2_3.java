package BTString_Array_Exception;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1_2_3 {

	private Scanner scanner;
	private float[] fl;
	private int[] in;
	private float x;

	public static void main(String[] args) {
//		System.out.println("home");

		/*
		 * new Main().bai1(); new Main().bai2();
		 */
	}

	/*
	 * Bài 1: Viết chương trình nhập dãy số thực có n phần tử và một số x. Dò xem
	 * trong dãy có hai phần tử liền nhau nào mà tổng của chúng bằng x không?
	 */

	/* TODO: BAI_TAP1 */
	public void bai1() {
		getInputFloat();
		boolean check = false;
		int count = -1;
		for (int i = 0; i < fl.length - 1; i++) {
			if (fl[i] + fl[i + 1] == x) {
				count = i;
				check = true;
			}
		}

		String anString = check ? "sum equals to x is: " + fl[count] + " and " + fl[count + 1]
				: "not found sum equals to x";
		System.out.println(anString);

	}

	// get element
	private void getInputFloat() {
		String inputString;
		scanner = new Scanner(System.in);
		System.out.println("Input value separated by spaces: ");

		inputString = scanner.nextLine();
		String[] strings = inputString.split(" ");
		fl = new float[strings.length];

		for (int i = 0; i < fl.length; i++) {
			fl[i] = Float.parseFloat(strings[i]);
		}

		System.out.println("Input element x, " + "system will find two adjacent numbers which sum equals to x");
		x = scanner.nextFloat();
	}

	/*
	 * Bài 2: Viết chương trình nhập vào một mảng số nguyên có n phần tử a) Xuất
	 * giá trị các phần tử của mảng. b) Tìm phần tử có giá trị lớn nhất, nhỏ
	 * nhất. c) Đếm số phần tử là số chẵn d) Tìm các phần tử là số nguyên
	 * tố. e) Sắp xếp mảng tăng dần f) Tìm phần tử có giá trị x
	 */

	/* TODO: BAI_TAP 2 */
	// get element
	private void getInputInteger() {
		String inputString;
		scanner = new Scanner(System.in);
		System.out.println("Input value separated by spaces: ");

		inputString = scanner.nextLine();
		String[] strings = inputString.split(" "); // magic
		in = new int[strings.length];

		for (int i = 0; i < in.length; i++) {
			in[i] = Integer.parseInt(strings[i]);
		}
	}

	public void bai2() {
		getInputInteger();
		// a.output array
		System.out.println("The array jsut entered is: " + Arrays.toString(in) + "\n");

		// b.find max min, c.count even numbers
		int max = in[0], min = in[0], i, count;
		count = in[0] % 2 == 0 ? 1 : 0;

		for (i = 1; i < in.length; i++) {
			if (max < in[i])
				max = in[i];
			else
				min = in[i];
			if (in[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Max is: " + max + " | Min is: " + min + "\n");
		System.out.printf("There are %d is even numbers \n \n", count);

		// d.find prime number
		for (i = 0; i < in.length; i++) {
			System.out.println(findPrimeNumbers(in[i])); // O(sqrt(n))
		}
		System.out.println();

		// f. find element has value x (find index)
		System.out.println("what element do you want to know index: ");
		float x = scanner.nextFloat();
		int ans = findIndex_X(x);
		if (ans == -1)
			System.out.println("not found");
		else
			System.out.println("index in array is: " + ans + "\n");

		// e.sort inc
		System.out.println("sorted increase: ");
		sort();

	}

	// d.find prime number
	private String findPrimeNumbers(int n) {
		// TODO Auto-generated method stub
		if (n == 2)
			return n + " is a prime number";

		boolean check = false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				check = true; // found not a prime number
				break;
			}
		}
		return check ? n + " not a prime number" : n + " is a prime number";
	}

	// e.sort incre
	public void sort() {
		// selection sort
		int min, i, j, temp;
		for (i = 0; i < in.length - 1; i++) {
			min = i;
			for (j = i + 1; j < in.length; j++) {
				// find minest element
				if (in[j] < in[min]) {
					min = j;
				}
			}
			// swap
			temp = in[min];
			in[min] = in[i];
			in[i] = temp;
		}

		System.out.println(Arrays.toString(in));
	}

	private int findIndex_X(float x) {
		// TODO Auto-generated method stub
		for (int i = 0; i < in.length; i++) {
			if (in[i] == x) {
				return i;
			}
		}
		return -1; // not found
	}

}
