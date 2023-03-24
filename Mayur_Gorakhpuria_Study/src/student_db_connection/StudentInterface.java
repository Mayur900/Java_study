package student_db_connection;

import java.sql.SQLException;
import java.util.List;


public interface StudentInterface {

	public List<Student> readAllStudent() throws SQLException;
	
	public Student readStudentById(int id);

	public int createStudent(Student st);
	
	public boolean updateStudent(Student st);

	public boolean deleteStudent(int id);
}
