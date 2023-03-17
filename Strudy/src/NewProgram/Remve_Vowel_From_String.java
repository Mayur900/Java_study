package NewProgram;

public class Remve_Vowel_From_String {

    public static void main(String[] args) {
        String s = "It uses those low order bytes of the result that can fit into the size of the type allowed by\n"
                + "the operation";
        String word[] = s.split("\\s");
        for (int i1 = 0; i1 < word.length; i1++) {

            char ch[] = word[i1].toCharArray();
            char vowel[] = {'a', 'e', 'i', 'o', 'u'};
            for (int i = 0; i < ch.length; i++) {

                for (int j = 0; j < vowel.length; j++) {

                    if (ch[i] == vowel[j]) {
                        ch[i] = ' ';
                    }
                }

            }
            for (char c : ch) {
                if (c != ' ') {
                    System.out.print(c);
                }
            }
            System.out.print(" ");

        }
    }
}
