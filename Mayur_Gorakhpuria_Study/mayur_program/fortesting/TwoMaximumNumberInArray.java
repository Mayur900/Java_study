package fortesting;

public class TwoMaximumNumberInArray {

    public static void main(String[] args) {

        int num[] = {5, 34, 78, 2, 45, 1, 99, 23};

        int first = 0;
        int seound = 0;
        for (int i = 0; i < num.length; i++) {

            if (first < num[i]) {
                seound = first;
                first = num[i];
            } else if (seound < num[i]) {
                seound = num[i];
            }

        }
        System.out.println(first);
        System.out.println(seound);

    }

}
