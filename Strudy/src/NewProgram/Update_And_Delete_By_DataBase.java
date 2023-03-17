
package NewProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_And_Delete_By_DataBase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hierarchical_Clustering","root","1212");
//        PreparedStatement ps = con.prepareStatement("UPDATE login SET password = ? WHERE username = ?");
          PreparedStatement ps = con.prepareStatement("delete from login where username = ?");
//        ps.setString(1, "rahul");
        ps.setString(1, "rahul");
        int i = ps.executeUpdate();
        System.out.println(i);
    }
    
}
