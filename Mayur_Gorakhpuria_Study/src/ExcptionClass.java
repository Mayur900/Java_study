import java.io.IOException;
import java.sql.SQLException;

public class ExcptionClass {
	
	void hello() throws NullPointerException {
		System.out.println("Hello");
	}
	
	void hello1() throws IndexOutOfBoundsException {
		System.out.println("Hello");
	}
	
	void hello12() {
		throw new NullPointerException();
		//System.out.println("df");
	}

}
