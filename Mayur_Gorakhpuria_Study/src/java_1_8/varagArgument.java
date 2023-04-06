package java_1_8;

import java.util.ArrayList;
import java.util.Arrays;

public class varagArgument {

	
	void hello(int a, int b, int c) {
		var i = new ArrayList<>();
		
		var o = new varagArgument();
		
		System.out.println(a + b + c);
	}

	void hello1(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	void hello2(int ...a) {
		
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		varagArgument v = new varagArgument();
		v.hello(0, 0, 0);
		v.hello1(0, 0, 0, 0);
		v.hello2(3,6,4);

	}

}
