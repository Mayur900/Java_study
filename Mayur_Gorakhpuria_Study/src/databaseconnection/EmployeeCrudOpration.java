package databaseconnection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCrudOpration {

	public static void main(String[] args) {

		EmployeeCrudImpl em = new EmployeeCrudImpl();

		readData(em);
		//readDataById(em);
		//insertData(em);

	}



	private static void insertData(EmployeeCrudImpl em) {
		EmployeeDTO emDto = new EmployeeDTO();
		emDto.setId(6);
		emDto.setFirstName("Vanshika");
		emDto.setLastName("Gadwal");
		emDto.setEmaiId("Nandini@gmail.com");
		emDto.setAddress("Indore");
		
		
		int i = em.createEmployee(emDto);
		if(i == 0) {
			System.out.println("Recod not insert");
		}else {
			System.out.println("Record insert");
		}
	}



	private static void readDataById(EmployeeCrudImpl em) {
		EmployeeDTO ep =  em.readEmployeeById(4);
		System.out.println(ep);
	}

	
	
	
	
	private static void readData(EmployeeCrudImpl em) {
		List<EmployeeDTO> empList = new ArrayList<>();
		//List<EmployeeDTO> empList = em.readAllEmployee();

		for (EmployeeDTO emDto : empList) {
			System.out.println(emDto);
		}
	}

}
