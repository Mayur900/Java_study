package Practice;

import java.util.HashMap;

public class HashMap_Duplicate_Key {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "hello");
        hm.put(2, "mayur");
        hm.put(1, "rahul");
        System.out.println(hm);
    }

}
