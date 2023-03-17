package Parttren_Programs;

/**
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
 */
public class Patren11 {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = i; j <= 7; j++) {
                System.out.print(j);
            }
            System.out.println("");
            if (i != 7) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(" ");
                }
            } else {
                for (int y = 1; y <= 6; y++) {
                    int value = 7;
                    value = value - y;
                    for (int k = 1; k < value; k++) {
                        System.out.print(" ");
                    }
                    for (int s = y; 0 <= s; s--) {
                        System.out.print(value++);
                    }
                    System.out.println("");
                }
            }
        }
    }
}
