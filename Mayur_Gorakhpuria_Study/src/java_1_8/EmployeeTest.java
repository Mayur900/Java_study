package java_1_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> list = getEmployee();
		
		//List<String> list1 = list.stream().map(Employee :: getName).toList();
		//List<String> list1 = list.stream().map(e -> e.getName()).toList();
	
		//List<String> list1 = list.stream().filter(e -> e.getName().startsWith("J")).map(s -> s.getName()).toList();
		
//		List<Employee> list1 = list.stream().filter(e -> e.getGender().equals("Male")).filter(e -> e.getSalary() > 25000).toList();
		
		/**
		list1.forEach(System.out :: println);
		
		list1.forEach(e -> System.out.println(e));
		
		list1.forEach(e -> {
			System.out.println(e);
		});
		
		
		for(Employee e : list1) {
			System.out.println(e);
		}
		
		
		for(int i= 0; i< list1.size(); i++) {
			Employee e = list1.get(i);
			System.out.println(e);
		}
		
		**/
		
//		List<String> list1 =  list.stream().map(Employee :: getDepartment).distinct().toList();
		
//		long list1 =  list.stream().map(Employee :: getDepartment).distinct().count();
//		System.out.println(list1);
		
//		long i = list.stream().filter(e -> e.getGender().equals("Male")).count();
//		System.out.println(i);

//		Map<String, Long> listMap = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		System.out.println(listMap);
		
		//List<String> depList = list.stream().map(Employee :: getDepartment).distinct().toList();
		//System.out.println(depList);
		
		
		//Map<String, Double> kd = list.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.averagingDouble(Employee :: getAge)));
		//System.out.println(kd);
		
		
		String name = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary))).get().name;
		System.out.println(name);
		
		
//		List<String> nameList = list.stream().filter(s -> s.getYearOfJoining() > 2015).map(Employee :: getName).toList();
//		System.out.println(nameList);
		
		//Map<String, Long> listDep = list.stream().collect(Collectors.groupingBy(Employee :: getDepartment , Collectors.counting()));
		//System.out.println(listDep);
		
//		Map<String, Double> kd = list.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.averagingDouble(Employee :: getSalary)));
//		System.out.println(kd);
	
//		Employee e = list.stream().filter(s -> s.getDepartment().endsWith("Product Development") && s.getGender().endsWith("Male")).min(Comparator.comparing(Employee :: getAge)).get();
//		System.out.println(e);
		
	}

	private static List<Employee> getEmployee() {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		return employeeList;
	}

}
