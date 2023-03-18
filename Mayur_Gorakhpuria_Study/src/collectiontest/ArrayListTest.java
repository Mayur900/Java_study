package collectiontest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
		
	//	ArrayList<String> list = new ArrayList<>();;
		
		
		String str = "The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.";
		
		String word[] = str.split("\\s");
		
		/*for (int i = 0; i < word.length; i++) {
			
			//list.add(word[i]);
			
		}*/
		ArrayList<String> list = new ArrayList<>(Arrays.asList(word));

		
		System.out.println(list);
		

	}

}
