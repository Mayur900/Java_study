package databaseconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCrudImpl implements EmployeeCrud {
	Connection con = DbConnection.getConnection();

	@Override
	public List<EmployeeDTO> readAllEmployee() {
		List<EmployeeDTO> list = new ArrayList<>();
		
		try {
			PreparedStatement pr = con.prepareStatement("Select * from employees");
			ResultSet rs = pr.executeQuery();
			while (rs.next()) {
				EmployeeDTO e = new EmployeeDTO();
				e.setId(rs.getInt(1));
				e.setFirstName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setEmaiId(rs.getString(4));
				e.setAddress(rs.getString(5));
				list.add(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	@Override
	public EmployeeDTO readEmployeeById(int id) {
		try {
			PreparedStatement pr = con.prepareStatement("select * from employees where id = ?");
			pr.setInt(1, id);
			ResultSet rs = pr.executeQuery();
			EmployeeDTO e = new EmployeeDTO();
			while (rs.next()) {
				e.setId(rs.getInt(1));
				e.setFirstName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setEmaiId(rs.getString(4));
				e.setAddress(rs.getString(5));
			}
			return e;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public int createEmployee(EmployeeDTO empDto) {
		int updateRecord = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into employees values(?,?,?,?,?)");
			ps.setInt(1, empDto.getId());
			ps.setString(2, empDto.getEmaiId());
			ps.setString(3, empDto.getFirstName());
			ps.setString(4, empDto.getLastName());
			ps.setString(5, empDto.getAddress());
			updateRecord = ps.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}
		return updateRecord;
	}

	@Override
	public boolean updateEmployee(EmployeeDTO empDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
