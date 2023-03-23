package databaseconnection;

import java.util.List;

public interface EmployeeCrud {
	
	public List<EmployeeDTO> readAllEmployee();
	
	public EmployeeDTO readEmployeeById(int id);

	public int createEmployee(EmployeeDTO empDto);
	
	public boolean updateEmployee(EmployeeDTO empDto);

	public boolean deleteEmployee(int id);
}
