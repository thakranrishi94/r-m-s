package r_m_s;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import r_m_s.Connectionprovide;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class a_train extends javax.swing.JFrame {

    /**
     * Creates new form a_train
     */
    public a_train() {
        initComponents();
        getlastid();
    }
    int lastid;
    public void getlastid(){
        String Query;
   ResultSet rs=select.getData("select max(train_no) from train");
       try {
           if(rs.next()){
                   lastid=rs.getInt(1);
                   lastid++;
                   jTextField1.setText(Integer.toString(lastid));
                   jTextField1.setEditable(false);
                   t1.setEditable(false);
                   t2.setEditable(false);
                   t3.setEditable(false);
                   t4.setEditable(false);
                   t5.setEditable(false);
                   t6.setEditable(false);
                   t7.setEditable(false);
                   t8.setEditable(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        b1 = new javax.swing.JLabel();
        a1 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        a3 = new javax.swing.JCheckBox();
        s4 = new javax.swing.JCheckBox();
        t1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("New Train ...");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Train No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Train name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Starting Stop");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ending stop");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Class");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Date&Time");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 251, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 250, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Add Train");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 100, 35));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 93, 35));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 86, 35));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 660, 77, 102));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", "Puducherry" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 250, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", "Puducherry" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 250, -1));

        b1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 460, 20));

        a1.setText("1st Ac");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        a1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                a1KeyPressed(evt);
            }
        });
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, 20));

        jCheckBox1.setText("2nd Ac");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, 20));

        a3.setText("3rd Ac");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, 20));

        s4.setText("sleepers");
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, 20));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Seats in 1st Ac");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Seats in 2nd Ac");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Seats in 3rd Ac");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, 30));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 100, 30));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 100, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Seats in Sleepers");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, 30));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 100, 30));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 100, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("fare of 1st Ac");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("fare of 2nd Ac");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Fare of 3rd Ac");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, 30));
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 100, 30));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 100, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Fare of Sleepers");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, 30));
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 100, 30));

        b2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 440, 20));

        b3.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 440, 20));

        b4.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 450, 20));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 240, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/r_m_s/passenger-5593947_1920.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String t_id=jTextField1.getText();
String t_name=jTextField2.getText();
String s_stop=(String) jComboBox1.getSelectedItem();
String e_stop=(String)jComboBox2.getSelectedItem();
//String clas=jTextField5.getText();
String sia1=t1.getText();
String sia2=t2.getText();
String sia3=t3.getText();
String sis=t4.getText();
String foa1=t5.getText();
String foa2=t6.getText();
String foa3=t7.getText();
String fos=t8.getText();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
String date=sdf.format(jDateChooser1.getDate());
if(t_id.equals("")||t_name.equals("")||s_stop.equals("")||e_stop.equals("")||date.equals(""))
{
    JOptionPane.showMessageDialog(null,"Every field is required");
}
else
{
   if(!sia1.matches("^[a-zA-Z]{0,12}$"))
                        { b1.setText(null);
    if(!foa1.matches("^[a-zA-Z]{0,12}$"))
                        { b1.setText(null);
    if(!sia2.matches("^[a-zA-Z]{0,12}$"))
                        { b2.setText(null);
    if(!foa2.matches("^[a-zA-Z]{0,12}$"))
                        { b2.setText(null);
    if(!sia3.matches("^[a-zA-Z]{0,12}$"))
                        { b3.setText(null);
    if(!foa3.matches("^[a-zA-Z]{0,12}$"))
                        { b3.setText(null);
    if(!sis.matches("^[a-zA-Z]{0,12}$"))
                        { b4.setText(null);
    if(!fos.matches("^[a-zA-Z]{0,12}$"))
                        { b4.setText(null);
    
       String Query;
                     String msg="Register Succesfully";
                    String msg2="Train already exist";
    Query="insert into train values('"+lastid+"','"+t_name+"','"+s_stop+"','"+e_stop+"','"+sia1+"','"+sia2+"','"+sia3+"','"+sis+"','"+foa1+"','"+foa2+"','"+foa3+"','"+fos+"','"+date+"')";
    //InsertUpdateDelete.setData(Query,"Register succesfully");
    
     Connection con=null;
        Statement st=null;
        try{
            con=Connectionprovide.getCon();
        st=con.createStatement();
        st.executeUpdate(Query);
        if(!msg.equals(""))
            JOptionPane.showMessageDialog(null,msg);
        setVisible(false);
        new a_train().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }}else{
        b4.setText("                                                                                   (Enter correct amount)");
    }}else{
        b4.setText("(Enter correct seats)");
    }}else{
        b3.setText("                                                                                   (Enter correct amount)");
    }}else{
        b3.setText("(Enter correct seats)");
    }}else{
        b2.setText("                                                                                   (Enter correct amount)");
    }}else{
        b2.setText("(Enter correct seats)");
    }}else{
        b1.setText("                                                                                   (Enter correct amount)");
    }}else{
        b1.setText("(Enter correct seats)");
    }
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
setVisible(false);
new a_train().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
setVisible(false);
new admin_home().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
//t1.setEditable(true); 
t1.setText("0");
t5.setText("0");
if(a1.isSelected()){
        t1.setEditable(true);
t5.setEditable(true);
}
else{
t1.setEditable(false);
t5.setEditable(true);
}// TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed

    private void a1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a1KeyPressed

    }//GEN-LAST:event_a1KeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
t2.setText("0");
t6.setText("0");
if(jCheckBox1.isSelected()){
        t2.setEditable(true); 
         t6.setEditable(true);     
}
else{
t2.setEditable(false);
t6.setEditable(true);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        t3.setText("0");
        t7.setText("0");   
        if(a3.isSelected()){
        t3.setEditable(true);
        t7.setEditable(true);
}
else{
t3.setEditable(false);
t7.setEditable(true);
}
    }//GEN-LAST:event_a3ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
t4.setText("0");
t8.setText("0");
if(s4.isSelected()){
        t4.setEditable(true);
        t8.setEditable(true);
}
else{
t4.setEditable(false);
t8.setEditable(true);
}
    }//GEN-LAST:event_s4ActionPerformed

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
            java.util.logging.Logger.getLogger(a_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a_train.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a_train().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox a1;
    private javax.swing.JCheckBox a3;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox s4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    // End of variables declaration//GEN-END:variables
}
