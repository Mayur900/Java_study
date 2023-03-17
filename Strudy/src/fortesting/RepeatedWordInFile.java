package fortesting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatedWordInFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader f = new FileReader("Myfile.txt");
        BufferedReader br = new BufferedReader(f);
        String line;

        ArrayList l = new ArrayList();
        while ((line = br.readLine()) != null) {
            String o[] = line.split("\\s");

            for (int i = 0; i < o.length; i++) {
                l.add(o[i]);
            }
        }
        HashMap<String, Integer> r = new HashMap<>();

        for (int i = 0; i < l.size(); i++) {

            String g = l.get(i).toString();
            int cout = 0;
            for (int j = 0; j < l.size(); j++) {

                String v = l.get(j).toString();
                if (g.equals(v)) {
                    cout++;
                }
            }
            if (!r.containsKey(g)) {
                r.put(g, cout);
            } else {
                int t = r.get(g);
                if (t < cout) {
                    r.put(g, cout);
                }
            }

        }

        for (Map.Entry<String, Integer> entry : r.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (value >= 5) {
                System.out.println(key + " :- " + value);
            }

        }
    }
}
