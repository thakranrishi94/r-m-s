package r_m_s;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 
 */
public class Connectionprovide {
    public static Connection getCon(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/RMS","root","root");
            return con;
        
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
        return null;
    }
    }
    
    
}