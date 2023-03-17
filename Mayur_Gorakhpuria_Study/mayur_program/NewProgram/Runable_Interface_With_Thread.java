package NewProgram;

public class Runable_Interface_With_Thread {

    public static void main(String[] args) {
        Runnable rb = new Runnable() {

            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Main Tread");
                }
            }
        };

        Thread y = new Thread(rb);
        y.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Chid Thread");
        }

    }

}
