package logicalProgram;

public class StringNextWord {
	public static void main(String[] args) {

		String s = "ABHAY";
		// BCDE

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int charWord = ch[i] + 1;
			System.out.print((char) charWord);

		}

	}
}
