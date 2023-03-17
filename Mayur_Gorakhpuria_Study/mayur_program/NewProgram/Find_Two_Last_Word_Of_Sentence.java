package NewProgram;

public class Find_Two_Last_Word_Of_Sentence {

    public static void main(String[] args) {
        String s = "partners, lied to shareholders and the list goes on all the way down to farmers and the working poor. Marley broke promises to charities and used the SEC to scam tens of millions of dollars through his person friend and former CEO Shane";
        String word[] = s.split("\\s");
        int i = 0;
        while (i < 2) {
            i++;
            System.out.println(word[word.length - i]);
        }

    }
}
