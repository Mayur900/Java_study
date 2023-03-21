package string_test;

public class StringTest {
	public static void main(String[] args) {

		String num = "900900";
		int i = Integer.parseInt(num);
		System.out.println(i);
		
		float f =  Float.parseFloat(num);
		System.out.println(f);
		
		int k = 909090;
		String s = String.valueOf(k);
		System.out.println(s);
		
		double d = Double.parseDouble(num);
		System.out.println(d);
		
		char ch = '!';
		
		int e = ch;
		System.out.println(e);
		
		
	}

}
