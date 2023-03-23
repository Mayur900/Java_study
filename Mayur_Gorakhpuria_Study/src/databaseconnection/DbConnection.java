package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_database?characterEncoding=utf8", "root",
					"root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
