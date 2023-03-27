package student_db_connection;

import java.util.List;

public class StudentOpration {
	public static void main(String[] args) {

//		read();
//		reayById();
//		insrt();
//		update();
		StudentInterfaceImpl st = new StudentInterfaceImpl();
		boolean bol = st.deleteStudent(7);
		if(bol) {
			System.out.println("Record delete");
		}else {
			System.out.println("Record not delete"); 
		}
		
		
	}

	private static void update() {
		StudentInterfaceImpl st = new StudentInterfaceImpl();
		Student s = new Student();
		s.setSid(1);
		s.setSname("Abhasek");
		boolean b = st.updateStudent(s);
		if(b) {
			System.out.println("Record Update");
		}else {
			System.out.println("Record not updated");
		}
	}

	private static void insrt() {
		StudentInterfaceImpl stu = new StudentInterfaceImpl();
		Student s = new Student();
		s.setSid(7);
		s.setSname("abhay");
		s.setSmother("manisha");
		s.setSfater("sanjay");
		s.setSaddress("burhanpur");
		s.setSage(21);
		s.setSmobile("7898888");
		int i = stu.createStudent(s);
		if (i == 0) {
			System.out.println("record not created");
		} else {
			System.out.println("Record created");
		}
	}

	private static void reayById() {
		StudentInterfaceImpl s = new StudentInterfaceImpl();
		Student student = s.readStudentById(1);
		System.out.println(student);
	}

	private static void read() {
		StudentInterfaceImpl si = new StudentInterfaceImpl();

		List<Student> listStudent = si.readAllStudent();
		for (Student s : listStudent) {
			System.out.println(s);
		}
	}
}
