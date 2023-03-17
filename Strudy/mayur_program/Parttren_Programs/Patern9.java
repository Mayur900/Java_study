package Parttren_Programs;

/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
 */
public class Patern9 {

    public static void main(String[] args) {
        int u = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                if (j > u) {
                    for (int l = u; 1 <= l; l--) {
                        System.out.print(l + " ");

                    }
                    u++;
                }
            }
            System.out.println("");
        }
    }

}
