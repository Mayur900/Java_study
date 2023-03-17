package Parttren_Programs;
/**
 * 0000000
 * 0100000
 * 0020000
 * 0003000
 * 0000400
 * 0000050
 * 0000006
 */
public class Patren16 {

    public static void main(String[] args) {
        int y = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("0");
                if (i > 1) {
                    if (j == y) {
                        System.out.print(j);
                        j++;
                        y++;
                    }
                }
            }
            System.out.println("");
        }
    }

}
