package ioOpretion;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilesReaderOPretion {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\abhay.txt");
			BufferedReader bf = new BufferedReader(fr);
			String line= " ";
			while(line!= null) {
				line=bf.readLine();
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
