package abhayTest;

public class StringNew {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Abhay"+" ");
		sb.append("Abhay Garhwal");
		System.out.println(sb);
		
		String s =  new String("Abhay");
		String s1="Garhwal";
		s=s.concat(" "+s1);
		//s=s+"Garhwal";
		//System.out.println(s);
	}
}
