/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package r_m_s;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class u_home extends javax.swing.JFrame {

    /**
     * Creates new form u_home
     */
    public u_home() {
        initComponents();
        getlastid();
       
    }
    int lastid;
    float poa1,poa2,poa3,pos;
    int sa1,sa2,sa3,ss,temp;
public void getlastid(){
    String Query;
   ResultSet rs=select.getData("select max(tic_id) from ticket");
       try {
           if(rs.next()){
                   lastid=rs.getInt(1);
                   lastid++;
                   jTextField13.setText(Integer.toString(lastid));
                   jTextField13.setEditable(false);
                   
               }
               
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Welcome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 160, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("User...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train No", "Train Name", "1st Ac seat", "2nd Ac seat", "3rd Ac seat", "sleeper seat", "1st Ac fare", "2nd Ac fare", "3rd Ac fare", "Sleeper fare"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 1050, 290));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Search Your train here");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ticket Booking");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Train No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Train name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Class");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Total Fare");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Phone no");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("No of passanger");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, -1, -1));

        jButton2.setText("Book Ticket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, -1));

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 130, -1));

        jTextField3.setEnabled(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 220, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Starting stop");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Ending stop");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        jTextField4.setEnabled(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 220, -1));

        jTextField5.setEnabled(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 220, -1));

        jTextField8.setEnabled(false);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 220, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 230, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 230, -1));

        jButton4.setText("Ok");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Date");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 220, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Ticket ID");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        jTextField13.setEnabled(false);
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 130, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Starting Stop");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", "Puducherry" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 150, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Ending stop");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", "Puducherry" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 150, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 220, 90, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("View Ticket");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Change password");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 560, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 710, 90, 60));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Exit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 560, 150, 30));

        l1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 410, 20));

        l2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 390, 20));

        jButton7.setText("Get Fare");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1stAc", "2ndAc", "3rdAc", "Sleepers" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 220, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 180, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 220, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/r_m_s/passenger-5593947_1920.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new u_home().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int check=0;
         String id=jTextField2.getText();
        if(id.equals(""))
        {
            check=1;
            JOptionPane.showMessageDialog(null,"id field is required");
        }
        else
        {
            ResultSet rs=select.getData("select*from train where train_no='"+id+"'");
            try{
                if(rs.next())
                {
                    check=1;
                    jTextField3.setEditable(false);
                    jTextField4.setEditable(false);
                    jTextField5.setEditable(false);
                   
                    jTextField3.setText(rs.getString(2));
                    jTextField4.setText(rs.getString(3));
                    jTextField5.setText(rs.getString(4));
                    
                    }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        if(check==0){
            JOptionPane.showMessageDialog(null,"Incorrect id");
        }            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String id=jTextField13.getText();
String train_no=jTextField2.getText();
String train_name=jTextField3.getText();
String S_stop=jTextField4.getText();
String e_stop=jTextField5.getText();
String clas=(String) jComboBox3.getSelectedItem();
String fare=jTextField8.getText();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
String Date=sdf.format(jDateChooser2.getDate());
String name=jTextField12.getText();
String phno=jTextField10.getText();
int no_pass=Integer.parseInt(jTextField11.getText());
if(id.equals("")||train_no.equals("")||train_name.equals("")||S_stop.equals("")||e_stop.equals("")||fare.equals("")||Date.equals("")||name.equals("")||phno.equals(""))
{
     JOptionPane.showMessageDialog(null,"Every field is required");
}
else{
    if(phno.matches("^[0-9]{10}$"))
                        {
                l1.setText(null);
                  
    String Query,Query1;
     String Query2;
   ResultSet rs=select.getData("select * from train where train_no='"+train_no+"'");
       try {
           if(rs.next()){
                   sa1 = rs.getInt(5);
                   sa2 = rs.getInt(6);
                   sa3 = rs.getInt(7);
                   ss = rs.getInt(8);
               }
               
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
       }
if(clas=="1stAc"){
    temp = sa1 - no_pass;
    if(temp>=0){
        Query="insert into ticket values('"+id+"','"+train_no+"','"+train_name+"','"+S_stop+"','"+e_stop+"','"+clas+"','"+fare+"','"+Date+"','"+name+"','"+no_pass+"','"+phno+"')";
    insertupdatedelete.setData(Query,"");
    Query1="update train set sia1="+temp+" where train_no='"+train_no+"'";
    insertupdatedelete.setData(Query1,"Register Successfull !");
    setVisible(false);
    new u_home().setVisible(true);}
    else{
            JOptionPane.showMessageDialog(null,"Seats are not available");
            }
    }
else if(clas=="2ndAc"){
    temp = sa2 - no_pass;
    if(temp>=0){
        Query="insert into ticket values('"+id+"','"+train_no+"','"+train_name+"','"+S_stop+"','"+e_stop+"','"+clas+"','"+fare+"','"+Date+"','"+name+"','"+no_pass+"','"+phno+"')";
    insertupdatedelete.setData(Query,"");
    Query1="update train set sia2="+temp+" where train_no='"+train_no+"'";
    insertupdatedelete.setData(Query1,"Register Successfull !");
    setVisible(false);
    new u_home().setVisible(true);}
    else{
        JOptionPane.showMessageDialog(null,"Seats are not available");
    }
}
else if(clas=="3rdAc"){
    temp = sa3 - no_pass;
    if(temp>=0){
        Query="insert into ticket values('"+id+"','"+train_no+"','"+train_name+"','"+S_stop+"','"+e_stop+"','"+clas+"','"+fare+"','"+Date+"','"+name+"','"+no_pass+"','"+phno+"')";
    insertupdatedelete.setData(Query,"");
    Query1="update train set sia3="+temp+" where train_no='"+train_no+"'";
    insertupdatedelete.setData(Query1,"Register Successfull !");
    setVisible(false);
    new u_home().setVisible(true);}
else{
    JOptionPane.showMessageDialog(null,"Seats are not available");
}}
else if(clas=="Sleepers"){
    temp = ss - no_pass;
    if(temp>=0){
        Query="insert into ticket values('"+id+"','"+train_no+"','"+train_name+"','"+S_stop+"','"+e_stop+"','"+clas+"','"+fare+"','"+Date+"','"+name+"','"+no_pass+"','"+phno+"')";
    insertupdatedelete.setData(Query,"");
    Query1="update train set sis="+temp+" where train_no='"+train_no+"'";
    insertupdatedelete.setData(Query1,"Register Successfull !");
    setVisible(false);
    new u_home().setVisible(true);}
    else{
        JOptionPane.showMessageDialog(null,"Seats are not available");
    }
}
}else{
            l1.setText("Enter the correct number");
            }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String starting=(String)jComboBox1.getSelectedItem();
String ending=(String)jComboBox2.getSelectedItem();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
String date=sdf.format(jDateChooser1.getDate());
        ResultSet rs=select.getData("select *from train where starti='"+starting+"' AND ending='"+ending+"' AND date='"+date+"'" );
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            while(rs.next())
            {
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
            }
            rs.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
setVisible(false);
new v_ticket().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you really wants to exit","Select",JOptionPane.YES_NO_OPTION);
        int check=0;
        if(a==0){
            setVisible(false);
            new home_page().setVisible(true);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
setVisible(false);
new chng_pwd().setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
String Query;
String id=jTextField2.getText();
   ResultSet rs=select.getData("select * from train where train_no='"+id+"'");
       try {
           if(rs.next()){
                   poa1=rs.getFloat(9);
                   poa2=rs.getFloat(10);
                   poa3=rs.getFloat(11);
                   pos=rs.getFloat(12);
                  }
               
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
       }
       
        String clas=(String)jComboBox3.getSelectedItem();
float pass=Float.parseFloat(jTextField11.getText());
float fare=poa1;
if(clas=="1stAc"){
         fare=pass*poa1;
         jTextField8.setText(Float.toString(fare));
         
    }
else if(clas=="2ndAc"){
    fare=pass*poa2;
         jTextField8.setText(Float.toString(fare));
}
else if(clas=="3rdAc"){  
         fare=pass*poa3;
         jTextField8.setText(Float.toString(fare));
}    
else if(clas=="Sleepers"){
         fare=pass*pos;
         jTextField8.setText(Float.toString(fare));
}
else{
    
}
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(u_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(u_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(u_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(u_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new u_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    // End of variables declaration//GEN-END:variables
}
