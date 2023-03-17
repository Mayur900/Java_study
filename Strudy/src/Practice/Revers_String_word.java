package Practice;

public class Revers_String_word {

    public static void main(String[] args) {

        String s = "This is the cow";
        //output= sihT si eht woc
        String word[] = s.split("\\s");
        for (int i = 0; i < word.length; i++) {
            char ch[] = word[i].toCharArray();
            for (int j = ch.length - 1; j >= 0; j--) {
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }
    }
}
