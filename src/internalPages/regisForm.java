/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import guiApp.loginForm3;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC COMPLAB
 */
public class regisForm extends javax.swing.JFrame {

    /**
     * Creates new form regisForm
     */
    public regisForm() {
        initComponents();
       
    }
    Color dashcolors = new Color(204, 204, 204);
    Color headers = new Color(153, 153, 153);
    Color bodycolors = new Color(51, 51, 51);
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        signup = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LAST NAME:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 70, 70, 16);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FIRST NAME:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 30, 80, 16);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-MAIL:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 180, 50, 16);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 220, 80, 16);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONFIRM PASSWORD:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 260, 130, 16);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USERNAME:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 110, 70, 16);

        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(200, 20, 210, 30);

        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(200, 250, 210, 30);

        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jTextField3.setOpaque(false);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(200, 210, 210, 30);

        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(200, 170, 210, 30);

        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jTextField5.setOpaque(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(200, 100, 210, 30);

        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jTextField6.setOpaque(false);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(200, 60, 210, 30);

        jRadioButton1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jRadioButton1.setText("FEMALE");
        jRadioButton1.setOpaque(false);
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(280, 140, 70, 23);

        jRadioButton2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jRadioButton2.setText("MALE");
        jRadioButton2.setOpaque(false);
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(200, 140, 60, 23);

        signup.setBackground(new java.awt.Color(0, 204, 204));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
        });
        signup.setLayout(null);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SignUp");
        signup.add(jLabel8);
        jLabel8.setBounds(0, 4, 100, 20);

        jPanel1.add(signup);
        signup.setBounds(170, 300, 100, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 370));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION FORM");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 10, 280, 30);

        minimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize);
        minimize.setBounds(370, 10, 40, 20);

        close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close);
        close.setBounds(400, 0, 50, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
       loginForm3 loginf = new loginForm3();
       this.dispose();
       loginf.setVisible(true);
    }//GEN-LAST:event_signupMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       loginForm3 loginf = new loginForm3();
       this.dispose();
       loginf.setVisible(true);
        
    }//GEN-LAST:event_closeMouseClicked

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
        signup.setBackground(bodycolors);
    
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
       signup.setBackground(headers);
    }//GEN-LAST:event_signupMouseExited

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
            java.util.logging.Logger.getLogger(regisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regisForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel signup;
    // End of variables declaration//GEN-END:variables
}
