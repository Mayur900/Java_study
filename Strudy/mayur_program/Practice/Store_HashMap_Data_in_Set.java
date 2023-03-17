
package Practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Store_HashMap_Data_in_Set {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();  
        
        for (int i = 1; i < 10; i++) {
            hm.put(i, "Hello"+i);
        }
        Set<Entry<Integer, String>> s = hm.entrySet();
        System.out.println(s);
        
    }
    
}
