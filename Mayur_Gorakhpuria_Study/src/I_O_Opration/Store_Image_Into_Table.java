package I_O_Opration;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import student_db_connection.SdbConnection;

public class Store_Image_Into_Table {

	public static void main(String[] args) {
		Connection con = SdbConnection.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement("insert into imageinsert values(?,?)");
			FileInputStream fis = new FileInputStream("D://ab.txt");
			ps.setInt(1, 2);
			ps.setBinaryStream(2, fis);
			int i = ps.executeUpdate();
			System.out.println(i);
		} catch (IOException | SQLException e) {
			System.out.println(e);
		}

	}

}
