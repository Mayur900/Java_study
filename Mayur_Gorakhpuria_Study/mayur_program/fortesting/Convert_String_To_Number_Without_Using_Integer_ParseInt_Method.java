package fortesting;

public class Convert_String_To_Number_Without_Using_Integer_ParseInt_Method {

    public static void main(String[] args) {

        String s = "3256";
        int sum = 0;
        int zeroAscii = (int) '0';
        for (int i = 0; i < s.length(); i++) {

            int r = (int) s.charAt(i);
            sum = (sum * 10) + (r - zeroAscii);

        }

        System.out.println(sum);
    }

}
