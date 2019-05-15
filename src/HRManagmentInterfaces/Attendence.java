/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRManagmentInterfaces;

import DBConnect.DBconnect;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Lap.lk
 */
public class Attendence extends javax.swing.JFrame {

    Connection c =null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    
    /**
     * Creates new form Attendence
     */
    public Attendence() {
        initComponents();
        viewAttendence();
        clear();
        
        c = DBconnect.getConnection();
        
        Toolkit toolkit = getToolkit();
        
    }

    public void viewAttendence(){
    
            try {
            
                Connection c = DBconnect.getConnection();
                Statement s = c.createStatement();
                
                
                
                String sql = "select date,empid,present,absent from attendence";
                
                pst = c.prepareStatement(sql);
                rs = pst.executeQuery();
                jattendence.setModel(DbUtils.resultSetToTableModel(rs));
                
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    
    }
    
    public void clear(){
        txtename.setText("");
        txtid.setText("");
        txtstatus.setText("");
        attend_combo.setSelectedIndex(0);
        combo_date.setDate(null);
    
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jattendence = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtename = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        btn_mark = new javax.swing.JButton();
        attend_combo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        combo_date = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_count = new javax.swing.JButton();
        txt_present = new javax.swing.JLabel();
        txt_absent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attedance dilusha.jpg"))); // NOI18N
        jLabel1.setText("       Attendencre marking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("EMPLOYEE ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jattendence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DATE", "EMPLOYEE ID", "PRESENT", "ABSENT"
            }
        ));
        jattendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jattendenceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jattendence);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 380, 120));

        jRadioButton1.setText("jRadioButton1");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 50, 10));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("EMPLOYEE NAME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("STATUS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidKeyReleased(evt);
            }
        });
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 140, 30));

        txtename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenameActionPerformed(evt);
            }
        });
        jPanel2.add(txtename, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 140, -1));
        jPanel2.add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 140, -1));

        btn_mark.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btn_mark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/k.png"))); // NOI18N
        btn_mark.setText("MARK");
        btn_mark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_markActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mark, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 150, 40));

        attend_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATTENDENCE", "ABSENT", "PRESENT", " " }));
        attend_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attend_comboActionPerformed(evt);
            }
        });
        jPanel2.add(attend_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 140, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("ABSENT OR PRESENT");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("DATE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 60, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clearr.png"))); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 170, 40));
        jPanel2.add(combo_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 140, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back2.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 150, 40));

        jLabel8.setText("ABSENT");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 60, 20));

        jLabel9.setText("PRESENT");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        btn_count.setText("COUNT");
        btn_count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_countActionPerformed(evt);
            }
        });
        jPanel2.add(btn_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        txt_present.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(txt_present, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 50, 20));

        txt_absent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(txt_absent, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 50, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hr-management-resources.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 380));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 913, 380));

        setSize(new java.awt.Dimension(929, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_markActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_markActionPerformed
        try {
            
            int x = JOptionPane.showConfirmDialog(rootPane,"do you want to add this????");
            
           if(x == 0){
                String empid = txtid.getText();
                String ename = txtename.getText();
                String status = txtstatus.getText();
                        
                String value = attend_combo.getSelectedItem().toString();
                
              
                
                
                
                Date date = combo_date.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String attend_date = dateFormat.format(date);
                
                
                Connection c = DBconnect.getConnection();
                Statement s = c.createStatement();
                
                if(value == "PRESENT"){
                
                    String query = "insert into attendence(empid,date,present,empname,status) values('"+empid+"','"+attend_date+"','"+value+"','"+ename+"','"+status+"')";
                    pst = c.prepareStatement(query);
                    pst.execute();
                }else if(value == "ABSENT"){
                    String query = "insert into attendence(empid,date,absent,empname,status) values('"+empid+"','"+attend_date+"','"+value+"','"+ename+"','"+status+"')";
                    pst = c.prepareStatement(query);
                    pst.execute();
                    
                
                }
                
                
                
                
                
                
                
                clear();
                viewAttendence();
            
            }else if(x == 1){
                System.out.println("cancel");
            }
            
           
           
           
           
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btn_markActionPerformed

    private void txtidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyReleased
        
        try {
            
            Connection c = DBconnect.getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM salary where empid='"+txtid.getText()+"'");
            
            if(rs.next()){
                txtename.setText(rs.getString("empname"));
                txtstatus.setText(rs.getString("status"));
                String type = attend_combo.getSelectedItem().toString();
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "invalid ID");
            
            }
            
        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_txtidKeyReleased

    private void attend_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attend_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attend_comboActionPerformed

    private void txtenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenameActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        txtid.setText("");
        txtename.setText("");
        txtstatus.setText("");
        attend_combo.setSelectedIndex(0);
        combo_date.setCalendar(null);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jattendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jattendenceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jattendenceMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_countActionPerformed
        
            //count attendence code....
        
        try {
            
            String sql1 = "select count(present)from attendence";
            pst = c.prepareStatement(sql1);
            rs = pst.executeQuery();
            
            if(rs.next()){
            
                String count = rs.getString("count(present)");
                txt_present.setText(count);
            }
            
            
            String sql2 = "select count(absent)from attendence";
            pst = c.prepareStatement(sql2);
            rs = pst.executeQuery();
            
            if(rs.next()){
            
                String count2 = rs.getString("count(absent)");
                txt_absent.setText(count2);
            }
            
            
            
           
            
            
            
        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_btn_countActionPerformed

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
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> attend_combo;
    private javax.swing.JButton btn_count;
    private javax.swing.JButton btn_mark;
    private com.toedter.calendar.JDateChooser combo_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jattendence;
    private javax.swing.JLabel txt_absent;
    private javax.swing.JLabel txt_present;
    private javax.swing.JTextField txtename;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
