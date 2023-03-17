package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Store_Data_In_Text_File {

    public static void main(String[] args) throws IOException {
        storeDataInFile();
        ReadFileData();
    }

    public static void storeDataInFile() throws IOException {
        String one = "Hello Dear";
        String two = "Hello Rahul";
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("MYStore.txt");
            bw = new BufferedWriter(fw);
            bw.write(one);
            bw.write(two);
        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {
            bw.close();
        }
    }

    public static void ReadFileData() throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("MYStore.txt");
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {
            br.close();
        }
    }
}
