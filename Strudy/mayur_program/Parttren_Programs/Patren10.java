package Parttren_Programs;

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1
 */
public class Patren10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = i; 1 <= j; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

}
