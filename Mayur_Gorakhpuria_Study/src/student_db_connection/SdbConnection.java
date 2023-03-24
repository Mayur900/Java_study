package student_db_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SdbConnection {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data?characterEncoding=utf8",
					"root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}

		return con;
	}

}
