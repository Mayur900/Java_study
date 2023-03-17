package Parttren_Programs;
/*
1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
 */
public class Patren12 {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j1 = 0; j1 < i - 1; j1++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 7; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        int value = 2;
        for (int i = 1; i < 7; i++) {
            for (int j = value; j < 7; j++) {
                System.out.print(" ");
            }
            for (int j = 7 - i; j <= 7; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
            value++;
        }
    }
}
