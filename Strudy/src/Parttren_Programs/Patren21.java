package Parttren_Programs;

/**
 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 5 4 3 2 1
          1 2 3 4 3 2 1
            1 2 3 2 1
              1 2 1
                1
 */
public class Patren21 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i > 1) {
                for (int j = i - 1; 1 <= j; j--) {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(j + " ");
            }
            for (int k = 9 - i; 1 <= k; k--) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }

    }
}
