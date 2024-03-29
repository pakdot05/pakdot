/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;


/**
 *
 * @author SCC COMPLAB
 */
public class DashboardPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form DashboardPage
     */
    public DashboardPage() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    Color dashcolors = new Color(204, 204, 204);
    Color headers = new Color(153, 153, 153);
    Color bodycolors = new Color(51, 51, 51);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ManageUser = new javax.swing.JButton();
        Reports = new javax.swing.JButton();
        Settings = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(620, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("We have more cars for you to choose.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 30, 220, 20);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAR RENTAL RESERVATION SYSTEM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 0, 430, 32);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalPages/carcar.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 265, 199);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 170));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalPages/icons8-user-100.png"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 120, 120);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(50, 30, 120, 120);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(null);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalPages/icons8-reports-85 (2).png"))); // NOI18N
        jPanel5.add(jLabel14);
        jLabel14.setBounds(0, 0, 120, 120);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(260, 30, 120, 120);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(null);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalPages/icons8-settings-100.png"))); // NOI18N
        jPanel6.add(jLabel15);
        jLabel15.setBounds(0, 0, 120, 120);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(460, 30, 120, 120);

        ManageUser.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        ManageUser.setText("MANAGE USER");
        ManageUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageUserMouseExited(evt);
            }
        });
        jPanel2.add(ManageUser);
        ManageUser.setBounds(50, 150, 120, 23);

        Reports.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        Reports.setText("REPORTS");
        Reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportsMouseExited(evt);
            }
        });
        jPanel2.add(Reports);
        Reports.setBounds(280, 150, 80, 23);

        Settings.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        Settings.setText("SETTINGS");
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsMouseExited(evt);
            }
        });
        jPanel2.add(Settings);
        Settings.setBounds(480, 150, 90, 23);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 650, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUserMouseEntered
        ManageUser.setBackground(bodycolors);
    }//GEN-LAST:event_ManageUserMouseEntered

    private void ManageUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUserMouseExited
       ManageUser.setBackground(headers);
    }//GEN-LAST:event_ManageUserMouseExited

    private void ReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseEntered
        Reports.setBackground(bodycolors);
    }//GEN-LAST:event_ReportsMouseEntered

    private void ReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseExited
        Reports.setBackground(headers);
    }//GEN-LAST:event_ReportsMouseExited

    private void SettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseEntered
        Settings.setBackground(bodycolors);
    }//GEN-LAST:event_SettingsMouseEntered

    private void SettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseExited
       Settings.setBackground(headers);
    }//GEN-LAST:event_SettingsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageUser;
    private javax.swing.JButton Reports;
    private javax.swing.JButton Settings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
