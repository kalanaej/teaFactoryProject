/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpackage;

import javax.swing.JOptionPane;
import java.text.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class orderarrived extends javax.swing.JFrame {

    /**
     * Creates new form orderarrived
     */
    public orderarrived() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TN = new javax.swing.JTextField();
        DN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DES = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LW = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        DT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DESC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        COS = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        St = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        DE = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Arrived");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("TruckNO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 132, -1, -1));

        jLabel3.setText("Driver Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        TN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNActionPerformed(evt);
            }
        });
        jPanel1.add(TN, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 129, 160, -1));
        jPanel1.add(DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 160, -1));

        jLabel4.setText("Consiger Name");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 100, -1));
        jPanel1.add(CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 170, -1));

        jLabel6.setText("Destination");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));
        jPanel1.add(DES, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, -1));

        jLabel7.setText("Package");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 80, 20));
        jPanel1.add(PC, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 170, -1));

        jLabel8.setText("Load weight");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 80, -1));
        jPanel1.add(LW, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 170, -1));

        jLabel10.setText("Delever Date");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, -1));
        jPanel1.add(DT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 160, -1));

        jLabel11.setText("Description");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));
        jPanel1.add(DESC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 160, 30));

        jLabel9.setText("Cost");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 80, 20));
        jPanel1.add(COS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 160, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add_plus.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 110, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit_pencil.png"))); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 126, -1));

        jLabel5.setText("Start");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, -1, -1));
        jPanel1.add(St, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 140, -1));

        jLabel12.setText("Delivery");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, -1, -1));
        jPanel1.add(DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 130, -1));

        jtable.setBackground(new java.awt.Color(255, 255, 0));
        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "TruckNo", "Driver Name", "Consiger Name", "start", "Destination", "Cost", "Load Weight", "Delivery", "Delivery date", "Description", "Package", "total cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtable.setOpaque(false);
        jScrollPane2.setViewportView(jtable);

        jMenu1.setText("File");

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit_1.png"))); // NOI18N
        jMenu2.setText("EXIT");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (TN.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, " TruckNUm  is empty");
        } else if (DN.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Driver Name  is empty");
        } else if (CN.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "consiger name  is empty");
        } else if (St.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Time  is empty");
        } else if (DES.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Destination  is empty");
        } else if (DE.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Deliver  Charge  is empty");
        } else {
            DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            model.addRow(new Object[]{TN.getText(), DN.getText(), CN.getText(), St.getText(), DES.getText(), COS.getText(), LW.getText(), DE.getText(), DT.getText(), DESC.getText(), PC.getText(),});
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Report of table");
        MessageFormat footer = new MessageFormat("page{0, number,integer}");

        try {
            jtable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        new AdminPannel().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(orderarrived.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderarrived.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderarrived.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderarrived.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderarrived().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CN;
    private javax.swing.JTextField COS;
    private javax.swing.JTextField DE;
    private javax.swing.JTextField DES;
    private javax.swing.JTextField DESC;
    private javax.swing.JTextField DN;
    private javax.swing.JTextField DT;
    private javax.swing.JTextField LW;
    private javax.swing.JTextField PC;
    private javax.swing.JTextField St;
    private javax.swing.JTextField TN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtable;
    // End of variables declaration//GEN-END:variables
}
