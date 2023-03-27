import java.sql.SQLException;

public class TestException {

	
	public static void main(String[] args) {
		ExcptionClass e = new ExcptionClass();
		try {
			e.hello12();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			throw new MyCustomException("Indput wrong");
		}
		e.hello();
		e.hello1();
		
	}
}
