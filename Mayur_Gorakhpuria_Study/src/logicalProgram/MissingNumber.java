package logicalProgram;

public class MissingNumber {
	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		int missingNumber = n[0];

		for (int i = 0; i < n.length; i++) {

			if (missingNumber != n[i]) {
				System.out.println(missingNumber);
				break;
			}
			missingNumber++;
		}
	}
}
