package Method;

public class Exception_Logic {

    public static void main(String[] args) {
        try {
            int a = 5, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("hello finaly");
        }
    }

}
