package fortesting;

public class ReversWordInStringArray {

    public static void main(String[] args) {

        String k = "hello world";

        String h[] = k.split(" ");
        for (int i = h.length; i > 0; i--) {
            System.out.print(h[i - 1] + " ");
        }

    }
}
