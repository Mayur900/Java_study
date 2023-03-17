package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetImplement {

    public static void main(String[] args) {

        Set s = new LinkedHashSet();

        s.add('a');
        s.add(6);
        s.add(5);
        s.add(null);
        s.add(1);
        s.add(3);
        //s.add(s);
        s.add(3);

//        for (Object object : s) {
//            
//            System.out.println(object);
//        }
        System.out.println(s);
    }

}
