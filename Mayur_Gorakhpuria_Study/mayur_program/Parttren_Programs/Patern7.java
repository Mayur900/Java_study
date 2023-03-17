package Parttren_Programs;

/*
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */
public class Patern7 {

    public static void main(String[] args) {
        int value = 7;
        for (int i = 1; i <= 7; i++) {
            for (int j = value; 1 <= j; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
            value--;
        }
    }

}
