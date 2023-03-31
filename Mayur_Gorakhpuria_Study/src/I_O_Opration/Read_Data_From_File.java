package I_O_Opration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Data_From_File {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("D://Log//ab.txt");
			br = new BufferedReader(fr);
			String line = "";

			while (line != null) {
				line = br.readLine();
				System.out.println(line);
			}
		} catch (Exception ex) {
			System.out.println(ex);

		} finally {
			br.close();
		}

	}

}
