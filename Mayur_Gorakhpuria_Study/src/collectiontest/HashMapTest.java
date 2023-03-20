package collectiontest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Hello");
		map.put(2, "Sleep");
		map.put(3, "Sleep");
		map.put(null, null);
		map.put(4, null);
		map.put(null, "sdsd");
		System.out.println(map.get(null));
		map.putIfAbsent(3, "ere");
		map.putIfAbsent(6, "ere");
		//map.
		

		System.out.println(map);
		
		
		
		
	}
	

}
