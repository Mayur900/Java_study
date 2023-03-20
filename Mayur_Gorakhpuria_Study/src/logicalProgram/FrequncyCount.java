package logicalProgram;

import java.util.ArrayList;
import java.util.List;

public class FrequncyCount {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 0 , 0, 3, 4, 3, 6,7, 5, 4, 6, 4, 4, 4, 8, 8, 5, 6, 3, 2 };

		List<Integer> list = new ArrayList<>();
		int count = 0;
		int number = a[0];
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			if (list.contains(n)) {
				continue;
			}
			int num = 0;
			for (int j = 0; j < a.length; j++) {
				if (n == a[j]) {
					num++;
				}
			}

			if (num > count) {
				count = num;
				number = a[i];
				System.out.println(number + " := " + count);
			}

			list.add(n);

		}

		//System.out.println(number + " := " + count);
	}
}
