
package fortesting;

import java.util.ArrayList;
import java.util.List;


public class Find_Longest_Substring_Without_Repeating_Characters{
    public static void main(String[] args) {
        String s = "java2novice";//output:- a2novice
        
     // String s = "java_language_is_sweet"; //output:- uage_is
     
        List<Character> l = new ArrayList<>();
     for (int i = 0; i < s.length(); i++) 
        {
            char r = s.charAt(i);
            int flag =0;
            for (int j = i+1; j < s.length(); j++) 
            {
                char t = s.charAt(j);
                if(r == s.charAt(j))
                {
                   flag = 1 ; 
                   break;
                }
              }
            if(flag == 0)
            {
                l.add(r);
                
            }
            if(flag == 1 )
            {
                l.clear();
            }
            
        }
    
        for (Character character : l) {
            
            System.out.print(character);
        }
        System.out.println("\n");
    
    }
          
    
}
