package Parttren_Programs;

/**
                  9
                8 9 8
              7 8 9 8 7
            6 7 8 9 8 7 6
          5 6 7 8 9 8 7 6 5
        4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
 */
public class Patren22 {

    public static void main(String[] args) {
        int k = 9;
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print("  ");
            }
            for (int j = i; 1 <= j; j--) {
                System.out.print(k++ + " ");
            }
            k--;
            k = 8;
            if (i > 1) {
                for (int j = i; 2 <= j; j--) {
                    System.out.print(k-- + " ");
                }
            }
            System.out.println("");
        }
    }
}
