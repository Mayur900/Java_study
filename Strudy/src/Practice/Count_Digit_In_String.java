package Practice;

public class Count_Digit_In_String {

    public static void main(String[] args) {
        String s = "ab12cd34ef45gh";
        char ch[] = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < ch.length; i++) {
            int value = ch[i];
            if (value < 97 || value > 125) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
