package logicalProgram;

import java.util.HashMap;

public class FrequncyCountWithHashMap {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 4, 4, 8, 8, 5, 6, 3, 2 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			if (map.containsKey(n)) {
				continue;
			}
			int num = 0;
			for (int j = 0; j < a.length; j++) {
				if (n == a[j]) {
					num++;
				}
			}

			map.put(a[i], num);
		}

		System.out.println(map);
	}
}
