package Practice;

public class Add_two_ArrayValue_Sum_or_Multi {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 4, 5, 6};

        // output: = sum :- 135801
        // output: = multi :- 1524064320
        String one = "";
        for (int i = 0; i < a.length; i++) {
            one = one.concat(String.valueOf(a[i]));
        }

        String two = "";
        for (int i = 0; i < b.length; i++) {
            two = two.concat(String.valueOf(b[i]));
        }

        int sum = Integer.parseInt(one) + Integer.parseInt(two);
        int multi = Integer.parseInt(one) * Integer.parseInt(two);
        System.out.println(sum);
        System.out.println(multi);
    }
}
