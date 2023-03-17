package Collection;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class Convert_Map_To_List {

    public static void main(String[] args) {

        Map<String, String> wordMap = new HashMap<>();
        wordMap.put("1", "mayur");
        wordMap.put("2", "mayur");
        wordMap.put("3", "mayur");
        wordMap.put("4", "mayur");
        wordMap.put("5", "mayur");

        Set<Entry<String, String>> set = wordMap.entrySet();
        List<Entry<String, String>> list = new ArrayList<>(set);

        for (Entry<String, String> entry : list) {

            System.out.println(entry);
        }

    }

}
