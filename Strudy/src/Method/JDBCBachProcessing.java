
package Method;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCBachProcessing {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3036/mayur","root", "1212");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayur", "root", "1212");
//        Statement s = con.createStatement();
        String sql = "insert into data value(?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(sql);
       
        
        
        st.setString(1, "4");
        st.setString(2, "4");
        st.setString(3, "4");
        st.setString(4, "4");
        st.setString(5, "4");
       
        st.addBatch();
        st.setString(1, "4");
        st.setString(2, "4");
        st.setString(3, "4");
        st.setString(4, "4");
        st.setString(5, "4");
               st.addBatch();
        st.setString(1, "4");
        st.setString(2, "4");
        st.setString(3, "4");
        st.setString(4, "4");
        st.setString(5, "4");
       
                st.addBatch();
                String g = "insert into data values(' 1 ','2','3','4',' 5 ')";
//        st.addBatch(g);
        int i[] =  st.executeBatch();
      
            for (int j = 0; j < i.length; j++) {
                System.out.println(j);
        }   
    
    }
    
}
