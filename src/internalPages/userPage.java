
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.dbconnectors;
import guiApp.customerForm;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax. swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
public class userPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form userPage
     */
    public userPage() {
        initComponents();
        displaydata();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    public void reset(){
        cid.setText("");
        cname.setText("");
        cage.setText("");
        caddress.setText("");
        ccontact.setText("");
    }
    
    public void displaydata(){
        
        try{
        
        dbconnectors dbc = new dbconnectors();
        ResultSet rs = dbc.getData("SELECT*FROM tbl_customer");
        customer_table.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException ex){
        System.out.println("Error Message:"+ex);
    }
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
        display = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        add1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        cid = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        cage = new javax.swing.JTextField();
        caddress = new javax.swing.JTextField();
        ccontact = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(620, 370));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setBackground(new java.awt.Color(153, 153, 153));
        display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                displayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displayMouseExited(evt);
            }
        });
        display.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DISPLAY");
        display.add(jLabel6);
        jLabel6.setBounds(0, 0, 100, 40);

        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 40));

        delete.setBackground(new java.awt.Color(153, 153, 153));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(null);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DELETE");
        delete.add(jLabel7);
        jLabel7.setBounds(0, 0, 100, 40);

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 100, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CUSTOMER");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 150, 50);

        add1.setBackground(new java.awt.Color(153, 153, 153));
        add1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add1MouseExited(evt);
            }
        });
        add1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ADD");
        add1.add(jLabel8);
        jLabel8.setBounds(0, 0, 100, 40);

        jPanel2.add(add1);
        add1.setBounds(490, 0, 100, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        customer_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(customer_table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 380, 320));

        cid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        cid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        jPanel1.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 200, 30));

        cname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        cname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 200, 30));

        cage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        cage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(cage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 200, 30));

        caddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        caddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(caddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 200, 30));

        ccontact.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        ccontact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(ccontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 200, 30));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 80, 40));

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, 40));

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseEntered
        display.setBackground(bodycolors);
    }//GEN-LAST:event_displayMouseEntered

    private void displayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseExited
        display.setBackground(headers);
    }//GEN-LAST:event_displayMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolors);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(headers);
    }//GEN-LAST:event_deleteMouseExited

    private void add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseEntered
        add1.setBackground(bodycolors);
    }//GEN-LAST:event_add1MouseEntered

    private void add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseExited
        add1.setBackground(headers);
    }//GEN-LAST:event_add1MouseExited

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        customerForm sf = new customerForm();
        sf.setVisible(true);
        
    }//GEN-LAST:event_add1MouseClicked

    private void displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseClicked
       displaydata();
    }//GEN-LAST:event_displayMouseClicked

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_cidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dbconnectors dbc = new dbconnectors();

        dbc.insertData("INSERT INTO tbl_customer (c_n, c_age, c_address, c_contact) "

                + "VALUES ('"+cname.getText()+"', '"+cage.getText()+"','"+caddress.getText()+"','"+ccontact.getText()+"')");

        displaydata();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void customer_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_tableMouseClicked
       int rowindex = customer_table.getSelectedRow();
       if(rowindex < 0){
           
       }else{
            TableModel model = customer_table.getModel();
            cid.setText(""+model.getValueAt(rowindex, 0));
            cname.setText(""+model.getValueAt(rowindex, 1));
            cage.setText(""+model.getValueAt(rowindex, 2));
            caddress.setText(""+model.getValueAt(rowindex, 3));
            ccontact.setText(""+model.getValueAt(rowindex, 4));
            
       }
    }//GEN-LAST:event_customer_tableMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowIndex = customer_table.getSelectedRow();
       
       
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = customer_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                           dbconnectors dbc = new dbconnectors();
                            dbc.deleteData(Integer.parseInt(id));
                            displaydata();
                     
                    }    
       
       }
    }//GEN-LAST:event_deleteMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dbconnectors dbc = new dbconnectors();
        int num = dbc.updateData("UPDATE tbl_customer "
                + "SET c_n = '"+cname.getText()+"', c_age='"+cage.getText()+"', "
                        + "c_address ='"+caddress.getText()+"', c_contact='"+ccontact.getText()+"'  "
                                + "WHERE c_id = '"+cid.getText()+"'");
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           displaydata();
           reset();
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add1;
    private javax.swing.JTextField caddress;
    private javax.swing.JTextField cage;
    private javax.swing.JTextField ccontact;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JTable customer_table;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel display;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
