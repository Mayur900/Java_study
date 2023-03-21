package logicalProgram;

import java.util.HashSet;
import java.util.Set;

public class Find_Dublicate_Number {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 0, 6, 4, 8, 5, 6, 3, 2 };
		Set<Integer> list = new HashSet<>();
		for(int i : a) {
			list.add(i);
		}
		System.out.println(list);
	}

}
