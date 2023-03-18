package collectiontest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		// String list store

		ArrayList<String> list1 = new ArrayList<>();;
		
		String str = "The Collection in Java is a framework c provides an architecture to store and manipulate the group of objects.";
		
		String word[] = str.split("\\s");
		
		for (int i = 0; i < word.length; i++) {
			
			list1.add(word[i]);
			
		}
		System.out.println(list1);
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(word));

		// Java replace " poaton"
		
		for (int i = 0; i < list1.size(); i++) {
			String outWord = list1.get(i);
			if(outWord.equals("Java")) {
				list1.add(i, "Payton");
				break;
			}
			
			/*if(outWord.equals("store")) {
				list1.remove(i);
			}*/
			
		}
		
		// remove store word

		list1.remove("store");
		System.out.println(list1);
		
		// the <--> position  <-->.objects
		String frist = list1.get(0);
		String secound = list1.get(list1.size()- 1);

		list1.set(0, secound);
		list1.set(list1.size()- 1, frist);
		System.out.println(list1);
		
		// size of list
		System.out.println(list1.size());
		
		// string print without ,,
		
		for (String st : list1) {
			System.out.print(st + " ");			
			
		}
		

	}

}
