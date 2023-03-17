package NewProgram;

public class Thread_with_Inner_Class {

    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Main Thred");
                }
            }
        };
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }

    }
}
