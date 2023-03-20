package logicalProgram;

import java.util.ArrayList;

public class Remove_Vowel_From_String {
	public static void main(String[] args) {
		String s = "It uses those low order bytes of the result that can fit into the size of the type allowed by the operation";

		char ch[] = s.toCharArray();

		/*
		 * for (char c : ch) { if (c != 'a' && c != 'i' && c != 'o' && c != 'u' && c !=
		 * 'e') { System.out.print(c); } }
		 */
		
		/**
		char vowel[] = {'a', 'e', 'i', 'o', 'u'};
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			for(char ce : vowel) {
				if(c == ce) {
					ch[i] = 'Z';
				}
			}
		}
		for(char sw : ch){
			if(sw != 'Z') {
				System.out.print(sw);
			}
		}
		**/
		ArrayList<Character> list = new ArrayList<>();
		for(char cs : ch) {
			list.add(cs);
		}
		
		char vowel[] = {'a', 'e', 'i', 'o', 'u'};
		ArrayList<Character> list1 = new ArrayList<>();
		for(char cs : vowel) {
			list1.add(cs);
		}
		
		list.removeAll(list1);
		
		for(Character c : list) {
			System.out.print(c);
		}


		
		

	}
}
