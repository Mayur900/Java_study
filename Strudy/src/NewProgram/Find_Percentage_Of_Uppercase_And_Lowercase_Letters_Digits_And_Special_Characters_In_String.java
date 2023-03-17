package NewProgram;

public class Find_Percentage_Of_Uppercase_And_Lowercase_Letters_Digits_And_Special_Characters_In_String {

    public static void main(String[] args) {

        String s = "Tiger Runs @ The Speed Of 100 km/hour.";
        int UpperLetter = 0;
        int LowerLetter = 0;
        int Digit = 0;
        int Other = 0;
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                UpperLetter++;
            } else if (Character.isLowerCase(ch[i])) {
                LowerLetter++;
            } else if (Character.isDigit(ch[i])) {
                Digit++;

            } else {
                Other++;
            }
        }
        System.out.println((UpperLetter * 100.0) / s.length());
        System.out.println((LowerLetter * 100.0) / s.length());
        System.out.println((Digit * 100.0) / s.length());
        System.out.println((Other * 100.0) / s.length());
    }

}
