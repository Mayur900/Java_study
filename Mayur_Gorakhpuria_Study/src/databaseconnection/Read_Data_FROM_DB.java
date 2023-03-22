package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read_Data_FROM_DB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		Statement ps = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?characterEncoding=utf8", "root", "root");
			ps = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}

		PreparedStatement pr = con.prepareStatement("Select * from student_data");
		ResultSet rs = pr.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getInt(3) + "," + rs.getString(3));
		}
		con.close();
		ps.close();
		pr.close();
		rs.close();

	}
}
