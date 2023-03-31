package I_O_Opration;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Data_In_Existing_File {

	public static void main(String[] args) throws IOException {

		try {
			String str = "Abhay\n";
			FileWriter fw = new FileWriter("D://Log//MYStore.txt", true);
			BufferedWriter out = new BufferedWriter(fw);
			out.write(str);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
