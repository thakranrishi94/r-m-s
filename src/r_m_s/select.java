package r_m_s;
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/Syst
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rishabh
 */
public class select {
    public static ResultSet getData(String query)
    {
        Connection con=null;
        ResultSet rs=null;
        Statement st=null;
        try{
            con=Connectionprovide.getCon();
            st=con.createStatement();
            rs=st.executeQuery(query);
            return rs;
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
}
