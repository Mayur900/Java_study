package I_O_Opration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import student_db_connection.Student;
import student_db_connection.StudentInterfaceImpl;

public class Write_Data_In_Files {

	public static void main(String[] args) throws IOException {

		StudentInterfaceImpl si = new StudentInterfaceImpl();

		List<Student> listStudent = si.readAllStudent();
	     
	        FileWriter fw = null;
	        BufferedWriter bw = null;
	        
	        try {
	            fw = new FileWriter("D://Log//Student.txt",true);
	            bw = new BufferedWriter(fw);
	           
	            for(Student s : listStudent) {
		            bw.write(s.toString());
		            bw.write("\n");
	            }
	            
	        } catch (Exception ex) {
	            ex.printStackTrace();

	        } finally {
	            bw.close();
	        }

	}

}
