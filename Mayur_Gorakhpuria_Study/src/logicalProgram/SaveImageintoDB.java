package logicalProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import student_db_connection.SdbConnection;

public class SaveImageintoDB {
public static void main(String[] args) throws SQLException, FileNotFoundException {
	Connection con = SdbConnection.getConnection();
	PreparedStatement pstmt = con.prepareStatement("INSERT INTO imagetable(id, image) VALUES (?, ?)");
    pstmt.setInt(1, 1);
    FileInputStream fin = new FileInputStream("D:/Pic.jpg");
    pstmt.setBinaryStream(2, fin);
    pstmt.execute();
    System.out.println("Image insert");
    
}
}
