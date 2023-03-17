//
//
//package NewProgram;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import javax.xml.parsers.ParserConfigurationException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
//import org.apache.poi.openxml4j.opc.OPCPackage;
//import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
//import org.apache.xmlbeans.XmlException;
//import org.xml.sax.SAXException;
//
//class ReadDocFileInJava{
//    public static void main(String[] args)throws FileNotFoundException,IOException,
//            XmlException,
//            InvalidFormatException,
//            OpenXML4JException,
//            ParserConfigurationException,
//            SAXException {
//       
//          try{  
//              File file = new File("TestFile.docx");
//           FileInputStream fs = new FileInputStream(file);
//        OPCPackage d = OPCPackage.open(fs);
//        XWPFWordExtractor xw = new XWPFWordExtractor(d);
//        System.out.println(xw.getText());
//         
//          }
//          catch (Exception e) 
//          {
//                e.printStackTrace();
//            }
//          
//        }
//    }
