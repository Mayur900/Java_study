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
	public Student readStudentById(int id) {
		Student s = new Student();
		try {
			PreparedStatement ps = con.prepareStatement("select * from student where sid = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				s.setSid(rs.getInt(1));
				s.setSname(rs.getString(2));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		return s;
	}

	@Override
	public int createStudent(Student st) {
		int updateRecord = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
			ps.setInt(1, st.getSid());
			ps.setString(2, st.getSname());
			ps.setString(3, st.getSmobile());
			ps.setString(4, st.getSfater());
			ps.setString(5, st.getSaddress());
			ps.setString(6, st.getSmobile());
			ps.setInt(7, st.getSage());
			updateRecord = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return updateRecord;
	}

	@Override
	public boolean updateStudent(Student st) {
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("update student set sname =? Where sid=?");

			ps.setString(1, st.getSname());
			ps.setInt(2, st.getSid());
			int i = ps.executeUpdate();
			if (i == 0) {
				return false;
			}

			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return true;

	}

	@Override
	public boolean deleteStudent(int id) {

		try {
			PreparedStatement ps = con.prepareStatement("delete from student Where sid=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if (i == 0) {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return true;
	}

	@Override
	public List<Student> readAllStudent() {

		List<Student> list = new ArrayList<>();
		String sql = "select * from student";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ResultSet rs;
			rs = ps.executeQuery();
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
