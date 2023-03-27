package opration;

import databaseconnection.EmployeeDTO;

public class Abhay {

	public static void main(String[] args) {
		Abhay a = new Abhay();
		EmployeeDTO e = new EmployeeDTO();
		e.setId(1);
		e.setFirstName("abha");
		e.setBabyName("asdsd");
		
		a.print(e);
		
		a.print(1, "name", "aanns","adds", "ssda","sdsd");
		
		
	}

	void print(EmployeeDTO m) {
		System.out.println(m.getId());
		System.out.println(m.getFirstName());
	}
	
	void print(int id, String name, String fatenamme, String mohert, String mobile,String babynamme) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(fatenamme);
	}
	
	
	
}
