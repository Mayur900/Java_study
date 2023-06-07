package ioOpretion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilesWriterOpretion {
	public static void main(String[] args) {
		FileWriter fw= null;
		BufferedWriter bw = null;
		try {
			 fw = new FileWriter("D:\\Abhay.txt",true);
			 bw = new BufferedWriter(fw);
			 String st ="Abhishek";
			 bw.write(st);
			 bw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
