package r_m_s;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ADMIN
 */
public class insertupdatedelete {
    public static void setData(String Query,String msg)
    {
        Connection con=null;
        Statement st=null;
        try{
            con=Connectionprovide.getCon();
        st=con.createStatement();
        st.executeUpdate(Query);
        if(!msg.equals(""))
            JOptionPane.showMessageDialog(null,msg);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            try{
                
            }
            catch(Exception e){
                
            }
        }
    }
}
