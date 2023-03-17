package fortesting;

public class DecimalToBinary {

    public static void main(String[] args) {

        int num = 14;
        int k[] = new int[25];
        int i = 0;
        while (num != 0) {
            k[i++] = (num % 2);
            num = num / 2;

        }
        for (int j = i; j > 0; j--) {
            System.out.print(k[j - 1]);
        }

    }
}
