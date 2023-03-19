package logicalProgram;

import java.util.Arrays;

public class ArrayBinary {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 1) {
				arr[i] = 0;
			} else if (arr[i] == 0) {
				arr[i] = 1;
			}

		}

		// for print array
		for (int j : arr) {
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));

	}
}
