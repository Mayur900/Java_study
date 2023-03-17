
package NewProgram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class WriteDataInFile {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter out = null;
        
        try {
            fw = new FileWriter("mayurmyfile.txt", true);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
            out.println("the text");
            out.print("mayr");
            out.close();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
}
