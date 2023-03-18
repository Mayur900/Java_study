package collectiontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("dtu"));

		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("abc");
		
		hs.add("abc");
		
		hs.add("xyz");
		
		
		//hs.clear();
		
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("who");
		
		
		hs.addAll(hs1);
		hs.addAll(list2);
		
//		hs.forEach(s -> System.out.print(s + " "));
		
		hs.
		//System.out.println(hs);
		
	}

}
