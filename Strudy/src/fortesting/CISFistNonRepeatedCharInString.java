
package fortesting;

import java.util.LinkedHashMap;
import java.util.Map;

public class CISFistNonRepeatedCharInString {
    
    public static void main(String[] args) {
        String s = "strrreeoesttttsssss";
        char k[] = s.toCharArray();
       LinkedHashMap<Character,Integer> o = new LinkedHashMap<>();
       int cout;
        for (int i = 0; i < k.length; i = i+1)
        {
          cout = 0;
            for (int j = 0; j < k.length; j++)
            {
                if(k[i]==k[j])
                {
                    cout++;
                }
                
            }
            o.put(k[i], cout);
            }
        char t = 0;
        for (Map.Entry<Character, Integer> entry : o.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if(value == 1)
            {
                 t = key;
                break;
            }
            
        }    
            System.out.println(t);
     
        
    }
    
}

