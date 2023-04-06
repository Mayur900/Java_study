package StringBufferPkg;

import java.util.StringJoiner;

public class StringUsed {
	
	public static void main(String[] args) {

		
		StringJoiner sj = new StringJoiner("$");
		sj.add("abc");
		sj.add("xyz");
		System.out.println(sj.toString());
		
	/**
	StringBuffer sb = new StringBuffer("asds");
	sb.append('c');
	sb.append(123);
	
	sb.append(new StringBuffer());
	System.out.println(sb);
//	System.out.println(sb.reverse());
	System.out.println(sb.substring(3, 6));
	
	
	StringBuilder sbr = new StringBuilder("sdsd");
	sbr.append('c');
	sbr.append(123);
	
	sbr.append(new StringBuffer());
	System.out.println(sbr);
	System.out.println(sb.reverse());
	System.out.println(sbr.substring(3, 6));
	
	*/
	
	
	}
}

