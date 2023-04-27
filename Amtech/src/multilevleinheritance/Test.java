package multilevleinheritance;

public class Test implements A,B{
	
	public void m() {
		System.out.println("Abhay");
	}
	
	public static void main(String[] args) {
		 B test = new Test();
		test.m();
	}
}
