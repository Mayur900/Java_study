package Parttren_Programs;

/**
 * 7
 * 7 6
 * 7 6 5
 * 7 6 5 4
 * 7 6 5 4 3
 * 7 6 5 4 3 2
 * 7 6 5 4 3 2 1
 */
public class Patern6 {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            int k = i;
            for (int j = 7; 1 <= k; j--) {
                System.out.print(j + " ");
                k--;
            }
            System.out.println("");
        }
    }

}
