package polimorfishem;

public interface Head {

	public static final int i = 10;
	int j = 10;

	void hello();

	void printHelloMsg();

	default void addmethod() {
		System.out.println("Head addmethod");
	}

}
