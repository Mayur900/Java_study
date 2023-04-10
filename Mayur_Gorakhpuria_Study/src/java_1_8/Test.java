package java_1_8;

public class Test {

	
	public static void main(String[] args) {
		
	/**	
	EmployeeInterface ei = new EmployeeInterface() {
		@Override
		public void hello() {
			System.out.println("Hello");
		};
	};
	
	ei.hello();
	
	**/
		
//	EmployeeInterface ei = () -> System.out.println("hello");
//	ei.hello();
	
//	EmployeeInterface ei = (name) -> System.out.println("Mr." + name);
//	ei.hello("Abhay");	
		
	/*
	 * EmployeeInterface ei = (name) -> { if(name.equals("Abhay")) {
	 * System.out.println(name); } }; ei.hello("Abhayd");
	 */
		
	/*
	 * EmployeeInterface ei = (name) -> { return "Mr" + name; };
	 */
	
		EmployeeInterface ei = (i) -> {
			if(i == 10) {
				return i * i;
			}
			return i;
		};
		
		System.out.println(ei.hello(101));
	
		
		
//		TestFunctnaiol tes = () -> System.out.println("HEllo");;
		
		Runnable r = () -> System.out.println("Hello");		
		r.run();
		

		/*
		 * StringJoiner sj = new StringJoiner(","); sj.add("Hello"); sj.add("world");
		 * 
		 * System.out.println(sj);
		 */
		
		
		
	}
}
