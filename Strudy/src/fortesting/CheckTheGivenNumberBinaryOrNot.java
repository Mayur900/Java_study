package fortesting;

public class CheckTheGivenNumberBinaryOrNot {

    public static void main(String[] args) {

        int num = 1000111;
        while (num != 0) {

            int j = num % 10;
            num = num / 10;

            if (j > 1) {
                System.out.println("Not a binary number");
                break;
            }

            if (num == 0) {
                System.out.println("Binary number");
            }
        }

    }

}
