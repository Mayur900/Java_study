
package NewProgram;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Get_All_Key_From_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> s = new HashMap<>();
        s.put(1, "raj");
        s.put(2, "kalu");
        s.put(3, "po");
        s.put(4, "value");
        s.put(5, "tr");
        System.out.println(s);
        Set<Integer> key = s.keySet();
        Collection value = s.values();
        System.out.println(key);
        System.out.println(value);
        Set<Map.Entry<Integer, String>> g = s.entrySet();
        System.out.println(g);
    }
    
}
