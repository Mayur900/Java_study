package student_db_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentInterfaceImpl implements StudentInterface {
	Connection con = SdbConnection.getConnection();
	
	@Override
	public List<Student> readAllStudent() throws SQLException {
	List<Student> list = new ArrayList<>();
	String sql = "select * from student";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs =  ps.executeQuery();
		while (rs.next()) {
			Student s = new Student();
			s.setSid(rs.getInt(1));
			s.setSname(rs.getString(2));
			s.setSfater(rs.getString(3));
			s.setSmother(rs.getString(4));
			s.setSmobile(rs.getString(5));
			s.setSaddress(rs.getString(6));
			s.setSage(rs.getInt(7));
			list.add(s);
		}
		return list;
	}

	@Override
	public Student readStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createStudent(Student st) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateStudent(Student st) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
