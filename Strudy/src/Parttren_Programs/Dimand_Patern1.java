package Parttren_Programs;

/**
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
public class Dimand_Patern1 {

    public static void main(String[] args) {
        int g = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= g; j++) {
                System.out.print("*");
            }
            g++;
            g++;
            System.out.println("");
            if (i == 5) {
                int g1 = 7;
                for (int j = 1; j <= 4; j++) {

                    for (int k = j; k >= 1; k--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= g1; k++) {
                        System.out.print("*");
                    }
                    g1--;
                    g1--;
                    System.out.println("");
                }
            }
        }
    }
}
