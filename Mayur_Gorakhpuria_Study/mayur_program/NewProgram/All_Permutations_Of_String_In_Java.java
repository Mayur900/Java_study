package NewProgram;

/*
JSP
JPS
SJP
SPJ
PJS
PSJ
 */
public class All_Permutations_Of_String_In_Java {

      public static void main(String[] args) 
    {
        
        String s ="JSP";
        char ch[] = s.toCharArray();
       
        for (int i = 0; i < ch.length; i++) {
            
            for (int j = i; j <=i; j++) {
                
                
                for (int k = j; k <= j; k++) {
                    
                    System.out.print(ch[i]);
                    System.out.print(ch[j]);
                    System.out.print(ch[k]);
                    
                }
                System.out.println("\n");
            }
        }
    
     }
    
  
  
    
}
