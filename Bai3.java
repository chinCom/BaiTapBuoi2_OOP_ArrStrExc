package BTString_Array_Exception;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

	private Scanner scanner;
	private int[][] matrix;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* System.out.println("Good night, Hello World! Tomorrow"); */
		Bai3 bai3 = new Bai3();
		bai3.input_Matrix();
		bai3.print_Matrix();
//		bai3.find_Min();
//		bai3.find_max_odd();
		bai3.find_row_max();
	}

	// input matrix
	public void input_Matrix() {

		scanner = new Scanner(System.in);
		System.out.println("input matrix integer n * m. Where n is row, m is column");

		// n
		System.out.println("input n: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		// m
		System.out.println("input m:");
		int m = scanner.nextInt();
		scanner.nextLine();

		matrix = new int[n][m];

		String inputString;
		String[] arr;
		int m2 = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("input value to matrix separated by spaces: ");
			inputString = scanner.nextLine();
			arr = inputString.split(" ");
			if (arr.length > m) {
				System.out.println("try again, idiot");
				break;
			}
			while (m2 < m) {
				matrix[i][m2] = Integer.parseInt(arr[m2]);
				m2++;
			}
			m2 = 0;
		}
	}

	// print matrix
	public void print_Matrix() {
		System.out.println("matrix is: " + Arrays.deepToString(matrix));
	}

	public int find_Min() {
		int i = 0, j = 0, min = matrix[0][0];

		while (i < matrix.length) {
			for (j = 0; j < matrix[0].length; j++) {
				if (min > matrix[i][j]) {
					min = matrix[i][j];
				}
			}
			i++;
		}
		System.out.println("min value in matrix: " + min);
		return min;
	}

	// find odd number greatest
	public int find_max_odd() {
		int i = 0, j = 0, max = matrix[0][0];

		while (i < matrix.length) {
			for (j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] % 2 != 0) {
					if (max < matrix[i][j]) {
						max = matrix[i][j];
					}
				}

			}
			i++;
		}
		System.out.println("max value in matrix (odd number) is: " + max);
		return max;
	}

	// find max sum int row
	public int find_row_max() {
		int i = 0, j = 0, sum = 0, ans = 0, maxRow = 0;

		while (i < matrix.length) {
			sum = 0;
			for (j = 0; j < matrix[0].length; j++) {
				sum += matrix[i][j];
			}
			if (sum > ans) {
				ans = sum;
				maxRow++;
			}
			i++;
		}
		System.out.println("row has value greatest sum is: " + maxRow);

		return maxRow;
	}

}
