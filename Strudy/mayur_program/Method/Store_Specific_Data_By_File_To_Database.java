package Method;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Store_Specific_Data_By_File_To_Database {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        Connection con = null;
        Statement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayur", "root", "1212");
            ps = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

        FileReader f = new FileReader("iris.txt");
        BufferedReader bf = new BufferedReader(f);
        String line;
        StringBuffer s = new StringBuffer();
        while ((line = bf.readLine()) != null) {

            s.append(line + "\n");

        }

        String lining[] = s.toString().split("\n");

        for (int i = 0; i < lining.length; i++) {
            if ("@DATA".equals(lining[i])) {
                for (int j = i + 1; j < lining.length; j++) {
                    if (!"%".equals(lining[j])) {
                        String word[] = lining[j].split(",");
                        for (int k = 0; k < word.length; k++) {
                            String key = word[k + 4];
                            // ps.execute("insert into data value("+word[k]+","+word[k+1]+","+word[k+2]+","+word[k+3]+","+word[k+4]+")");

                            ps.execute("insert into data values('" + word[k] + "','" + word[k + 1] + "','" + word[k + 2] + "','" + word[k + 3] + "','" + word[k + 4] + "')");
                            break;

                        }

                    }
                }
            }

        }
        ps.close();
      
        PreparedStatement pr = con.prepareStatement("Select * from data");
        ResultSet rs = pr.executeQuery();
        
        while (rs.next())
        {            
        
           
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5));
            
        }
        con.close();
        
        pr.close();
        rs.close();
        

    }
}
