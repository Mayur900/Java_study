package NewProgram;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate_In_Set extends HashSet<Object> {

    public static void main(String[] args) {

        Set<Integer> ts = new TreeSet<>(new MyComprator());

        ts.add(20);
        ts.add(2);
        ts.add(20);
        ts.add(5);
        ts.add(6);
        ts.add(9);
        ts.add(9);
        ts.add(10);
        System.out.println(ts);
    }
}

class MyComprator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return +1;
    }

}
