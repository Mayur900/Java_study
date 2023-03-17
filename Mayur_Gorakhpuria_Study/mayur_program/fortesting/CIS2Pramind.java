package fortesting;

public class CIS2Pramind {

    public static void main(String[] args) {

        int i, j, k, l;

        for (i = 1; i <= 6; i++) {
            for (j = 6; j > i; j--) {
                System.out.print(" ");
            }

            for (k = i - 1; k >= 0; k--) {
                System.out.print(k);
            }

            for (l = 1; l < i; l++) {
                System.out.print(l);
            }
            System.out.print("\n");
        }

    }

}
