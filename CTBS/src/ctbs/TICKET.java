/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctbs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.AWTEventListener;
import javax.swing.*;
import ctbs.SIGN_UP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import ctbs.BOOKING111;
import ctbs.TICKET;
import javafx.scene.control.ComboBox;
import ctbs.TICKET;
import java.lang.String;
import java.sql.PreparedStatement;
/**
 *
 * @author student
 */
public class TICKET extends javax.swing.JFrame {

    PreparedStatement pst =null;
    /**
     * Creates new form NewJFrame
     */
    public TICKET() {
        initComponents();
    }
    public TICKET(String para,int tot,String vipn,String fcn,String gn,String vt,String ft,String gt,int cost) {
        initComponents();
        
           txtname.setText(para);
           String t=Integer.toString(tot);
           String c=Integer.toString(cost);
           txtbooked.setText(t);
           txtvipn.setText(vipn);
           txtfcn.setText(fcn);
           txtgn.setText(gn);
           txtvips.setText(vt);
           txtfcs.setText(ft);
           txtgs.setText(gt);
           txtcost.setText(c);
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtbooked = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtvipn = new javax.swing.JTextField();
        txtfcn = new javax.swing.JTextField();
        txtgn = new javax.swing.JTextField();
        txtvips = new javax.swing.JTextField();
        txtfcs = new javax.swing.JTextField();
        txtgs = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtcost = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 32, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("CRICKET TICKET BOOKING SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 440, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("CONGRATS YOUR TICKET ARE BOOKED !!!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText(" DETAILS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 72, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("       NAME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 99, -1));

        txtname.setEditable(false);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 224, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("NO. OF TICKETS BOOKED");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        txtbooked.setEditable(false);
        getContentPane().add(txtbooked, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 113, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("VIP CLASS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("FIRST CLASS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("GALLERY");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        txtvipn.setEditable(false);
        getContentPane().add(txtvipn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 65, -1));

        txtfcn.setEditable(false);
        txtfcn.setText(" ");
        getContentPane().add(txtfcn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 65, -1));

        txtgn.setEditable(false);
        txtgn.setText(" ");
        getContentPane().add(txtgn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 65, -1));

        txtvips.setEditable(false);
        txtvips.setText(" ");
        txtvips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvipsActionPerformed(evt);
            }
        });
        getContentPane().add(txtvips, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 500, -1));

        txtfcs.setEditable(false);
        txtfcs.setText(" ");
        getContentPane().add(txtfcs, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 500, -1));

        txtgs.setEditable(false);
        txtgs.setText(" ");
        getContentPane().add(txtgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 500, -1));

        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("COST IN Rs.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 310, 90, 20));
        getContentPane().add(txtcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 310, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtvipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvipsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvipsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Thank" +" "+ "You");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TICKET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICKET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICKET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICKET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICKET().setVisible(true);
                 TICKET myFrame = new TICKET();
                      myFrame.setVisible(true);
                      myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtbooked;
    private javax.swing.JTextField txtcost;
    private javax.swing.JTextField txtfcn;
    private javax.swing.JTextField txtfcs;
    private javax.swing.JTextField txtgn;
    private javax.swing.JTextField txtgs;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtvipn;
    private javax.swing.JTextField txtvips;
    // End of variables declaration//GEN-END:variables
}
