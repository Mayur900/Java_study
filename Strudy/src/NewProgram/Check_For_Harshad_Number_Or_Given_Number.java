package NewProgram;

import java.util.Scanner;

public class Check_For_Harshad_Number_Or_Given_Number {
// Harshad Number is a positive integer which is divisible by the sum of its digits, also called a Niven number
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int given = num;
        int e;
        int r = 0;
        while (num > 0) {
            e = num % 10;
            r += e;
            num = num / 10;
        }
        if (given % r == 0) {
            System.out.println(given + " is a Harshad number ");
        } else {
            System.out.println(given + " is Not a Harshad number ");
        }

    }

}
