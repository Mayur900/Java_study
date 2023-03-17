package fortesting;

public class RepetedCharInStringPrintWord 
{
    public static void main(String[] args) 
    {
        String s = "My name is shikha dongre I live in Mandleshwar.";
        String word[] = s.split("\\s");
        char temp;
        int counter;
        String myword = "";
        int counter2=0;
      
        for (int i = 0; i < word.length; i++)
        {
            counter = 0;
            char [] ch = word[i].toCharArray();
           
            for (int j = 0; j < ch.length; j++)
            {
                temp = ch[j];
              
                for (int k = j+1; k < ch.length; k++) 
                {
                if(temp == ch[k])
                {
                counter++;
                }   
                }
             }
            
            if(counter>counter2)
                {
                    counter2 = counter;
                    myword = word[i];
                }
        }
         System.out.println(myword);
    }
}
