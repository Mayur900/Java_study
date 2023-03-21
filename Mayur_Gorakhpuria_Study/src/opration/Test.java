package opration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		Model m = new Model();
		m.setIntId(1);
		m.setCharV('c');
		m.setDe(10.0);
		m.setFloatV(20f);
		m.setNameString("Abhay");

		String s[] = new String[10];
		s[0] = "Abhay";
		s[1] = "Nandini";
		m.setNameArray(s);

		List<String> list = new ArrayList<>();
		list.add("Golu");
		list.add("Java");
		m.setList(list);

		Set<String> set = new HashSet<>();
		set.add("Golu1");
		set.add("Java1");
		m.setSet(set);

		HashMap<String, String> map = new HashMap<>();
		map.put("Abahy", "Java");
		map.put("Abhishe", "Daru");
		m.setMap(map);

		OprationIinterface oi = new OprationTest();
		oi.printIntId(m);
		oi.printCharV(m);
		oi.printDe(m);
		oi.printFloatV(m);
		oi.printNameString(m);
		oi.printNameArray(m);
		oi.printList(m);
		oi.prinSet(m);
		oi.prinMap(m);

	}
}
