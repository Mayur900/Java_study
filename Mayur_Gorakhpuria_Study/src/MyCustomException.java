
public class MyCustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyCustomException() {
		super();
	}
	
	MyCustomException(String msg){
		System.out.println(msg);
	}
	
}
