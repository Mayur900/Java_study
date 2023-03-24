package student_db_connection;

import java.sql.SQLException;
import java.util.List;

public class StudentOpration {
	public static void main(String[] args) throws SQLException {

		StudentInterfaceImpl si = new StudentInterfaceImpl();
		List<Student> listStudent = si.readAllStudent();
		for (Student s : listStudent) {
			System.out.println(s);
		}
		
	}
}
