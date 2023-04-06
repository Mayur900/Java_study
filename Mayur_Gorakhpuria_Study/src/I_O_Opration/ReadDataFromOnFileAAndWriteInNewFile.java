package I_O_Opration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadDataFromOnFileAAndWriteInNewFile {

	public static void main(String[] args) throws IOException {

		ArrayList<String> list = readFile();
		
		
		if(list != null && list.size() > 0) {
			writeFile(list);
			System.out.println("Done");
		}else {
			System.out.println("Data Not found for write");
		}
		

	}

	private static void writeFile(ArrayList<String> list) {
		try {
			FileWriter fw = new FileWriter("abcdfs.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (String str : list) {
				if (str != null) {
					bw.write(str);
					bw.write("\n");
				}
			}
			bw.close();
			fw.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static ArrayList<String> readFile() {
		ArrayList<String> list = new ArrayList<>();

		try {

			FileReader fr = new FileReader("Opration.txt");
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			while (line != null) {
				line = br.readLine();
				list.add(line);
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
