package Parttren_Programs;

public class Increment_Number {

    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k++);
                System.out.print(" ");
            }
            System.out.println("");

        }
    }

}
