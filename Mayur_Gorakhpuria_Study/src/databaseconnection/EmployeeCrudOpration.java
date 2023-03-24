package databaseconnection;

import java.util.List;

public class EmployeeCrudOpration {

	public static void main(String[] args) {

		EmployeeCrud em = new EmployeeCrudImpl();

		//readData(em);
		//readDataById(em);
		insertData(em);

	}



	private static void insertData(EmployeeCrud em) {
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



	private static void readDataById(EmployeeCrud em) {
		EmployeeDTO ep =  em.readEmployeeById(4);
		System.out.println(ep);
	}

	
	
	
	
	private static void readData(EmployeeCrud em) {
		List<EmployeeDTO> empList = em.readAllEmployee();

		for (EmployeeDTO emDto : empList) {
			System.out.println(emDto);
		}
	}

}
