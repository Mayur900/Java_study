package I_O_Opration;

public class ATest extends A {

	@Override
	public void hello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		
		A a = new ATest();
		a.hello();
		a.addhello();
	}
}
