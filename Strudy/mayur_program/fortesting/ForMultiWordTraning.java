package fortesting;

public class ForMultiWordTraning {

    public static void main(String[] args) {

//        String s = "ababcaabcabcaab";
//
//        char ch[] = s.toCharArray();
//
//        for (int i = 0; i < ch.length; i++) 
//        {
//        
//            String k =  "" + ch[i]+ch[i+1]+ch[i+2];
//                    
//            if(s.contains(k))
//            {
//                System.out.println("");
//            
//            }
//        }



    String text = "ababcaabcabcaab";
    
 String longest = "";
 int g = longest.length();
 int a = text.length() - 2 * longest.length() * 2;
    for (int i = 0; i < a; i++)
    {
        OUTER:
       
       for (int j = longest.length() + 1; j * 2 < text.length() - i; j++) {
            String find = text.substring(i, i + j);
            for (int k = i + j; k <= text.length() - j; k++) {
                if (text.substring(k, k + j).equals(find)) {
                    longest = find;
                    continue OUTER;
                }
            }
            break;
        }
    }
  System.out.println(longest);
}



 }
