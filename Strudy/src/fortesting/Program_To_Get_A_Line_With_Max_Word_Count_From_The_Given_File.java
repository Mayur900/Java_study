package fortesting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program_To_Get_A_Line_With_Max_Word_Count_From_The_Given_File {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String line;
        StringBuffer str = new StringBuffer();
        FileReader f = new FileReader("Myfile.txt");
        BufferedReader bf = new BufferedReader(f);
        while ((line = bf.readLine()) != null) {
            str.append(line + "\n");
        }
        bf.close();
        f.close();

        String lining[] = str.toString().split("\n");

        int temp = 0;
        int cout = 0;
        String bingwordline = null;
        for (int i = 0; i < lining.length; i++) {
            cout = 0;
            String word[] = lining[i].split("\\s");
            for (int j = 0; j < word.length; j++) {

                cout++;

            }
            if (cout > temp) {
                temp = cout;
                bingwordline = lining[i];
            }

        }
        System.out.println(bingwordline);
        System.out.println(cout);

    }

}
