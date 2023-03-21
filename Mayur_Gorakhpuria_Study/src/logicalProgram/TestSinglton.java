package logicalProgram;

import fortesting.MySingleton;

public class TestSinglton {
	
	public static void main(String[] args) {
		
		MySingleton m = MySingleton.getInstance();
		
		MySingleton m1 = MySingleton.getInstance();

		System.out.println(m.hashCode());
		System.out.println(m1.hashCode());
		
		m.testMe();
	}

}
