/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * updatetreatment.java
 *
 * Created on Dec 28, 2011, 2:07:47 PM
 */

package view;

import Controller.Controller;
import DB.DbConnection;
import Model.mTreatment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author abc
 */
public class updatetreatment extends javax.swing.JFrame {
Connection con = null;
    /** Creates new form updatetreatment */
    public updatetreatment() {
        
        try {
            initComponents();
            lbllname.setVisible(true);
            txtlname.setVisible(true);
            lblcostval.setVisible(false);
            gettreatment.rdopatname.setText("Pat_name");
            String rdo = gettreatment.rdopatname.getText();
            String cbo = gettreatment.cbopatname.getSelectedItem().toString();
            con = DbConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery("select Pat_id,Pat_name,T_id,T_name,T_cost from tbl_Treatment where " + rdo + " = '" + cbo + "'");
            while (rs.next()) {
                String patid = rs.getString("Pat_id");
                txtpatid.setText("" + patid);
                String patname = rs.getString("Pat_name");
                txtpatname.setText("" + patname);
                String tid = rs.getString("T_id");
                txttreatid.setText("" + tid);
                String tname=rs.getString("T_name");
                txtlname.setText(""+tname);
                String tcost = rs.getString("T_cost");
                txtcost.setText("" + tcost);
            }
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(updatetreatment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(updatetreatment.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(updatetreatment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpatid = new javax.swing.JTextField();
        txtpatname = new javax.swing.JTextField();
        lblnameval = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txttreatid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbotreatname = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtcost = new javax.swing.JTextField();
        lbllname = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        lblcostval = new javax.swing.JLabel();
        btnpsave1 = new javax.swing.JButton();
        btnpcancel1 = new javax.swing.JButton();
        btnpatback = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UPDATE TREATMENT");

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true), "PATIENT DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("PATIENT ID :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("PATIENT NAME:");

        txtpatid.setEditable(false);

        txtpatname.setEditable(false);
        txtpatname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpatnameKeyTyped(evt);
            }
        });

        lblnameval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblnamevalKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(txtpatid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnameval)
                            .addComponent(txtpatname, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtpatid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtpatname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lblnameval)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true), "TREATMENT DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("TREATMENT ID :");

        txttreatid.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("TREATMENT NAME :");

        cbotreatname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Root canal", "Filling", "Porcelain lamination", "Whitening", "Bleaching", "Bridge prosthesis", "Claening", "Tooth implant", "Fixing braces", " " }));
        cbotreatname.setSelectedIndex(-1);
        cbotreatname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotreatnameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("COST :");

        txtcost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcostKeyTyped(evt);
            }
        });

        lbllname.setFont(new java.awt.Font("Arial", 1, 18));
        lbllname.setForeground(new java.awt.Color(51, 51, 255));
        lbllname.setText("LAST TREATMENT :");

        txtlname.setEditable(false);

        lblcostval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblcostvalKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(lbllname))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(62, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbotreatname, 0, 154, Short.MAX_VALUE)
                                    .addComponent(txttreatid, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcost, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcostval))
                                .addGap(223, 223, 223))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttreatid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllname)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbotreatname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(lblcostval)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        btnpsave1.setBackground(new java.awt.Color(153, 204, 255));
        btnpsave1.setFont(new java.awt.Font("Arial", 1, 24));
        btnpsave1.setForeground(new java.awt.Color(51, 51, 255));
        btnpsave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update6.png"))); // NOI18N
        btnpsave1.setText("UPDATE");
        btnpsave1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnpsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpsave1ActionPerformed(evt);
            }
        });

        btnpcancel1.setBackground(new java.awt.Color(153, 204, 255));
        btnpcancel1.setFont(new java.awt.Font("Arial", 1, 24));
        btnpcancel1.setForeground(new java.awt.Color(51, 51, 255));
        btnpcancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gCancel1.jpg"))); // NOI18N
        btnpcancel1.setText("CANCEL");
        btnpcancel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnpcancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpcancel1ActionPerformed(evt);
            }
        });

        btnpatback.setBackground(new java.awt.Color(153, 204, 255));
        btnpatback.setFont(new java.awt.Font("Arial", 1, 24));
        btnpatback.setForeground(new java.awt.Color(51, 51, 255));
        btnpatback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.gif"))); // NOI18N
        btnpatback.setText("BACK");
        btnpatback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnpatback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatbackActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tooth-340-255.jpg"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnpsave1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(btnpcancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(btnpatback, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpsave1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpcancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpatback, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(331, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblnamevalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblnamevalKeyTyped
       
    }//GEN-LAST:event_lblnamevalKeyTyped

    private void btnpcancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpcancel1ActionPerformed

}//GEN-LAST:event_btnpcancel1ActionPerformed

    private void btnpatbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatbackActionPerformed


        homepage hp=new homepage();
        hp.setVisible(true);
        this.dispose();
}//GEN-LAST:event_btnpatbackActionPerformed

    private void lblcostvalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblcostvalKeyTyped
        
}//GEN-LAST:event_lblcostvalKeyTyped

    private void txtpatnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpatnameKeyTyped
       try {
            char ch =evt.getKeyChar();
            if(ch>='0' & ch<='9') {
                evt.consume();
                txtpatname.setText("");
                lblnameval.setVisible(true);
                lblnameval.setText("Enter Alphabets Only");
            } else {
                lblnameval.setVisible(false);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtpatnameKeyTyped

    private void txtcostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostKeyTyped
        try {
            char ch =evt.getKeyChar();
            if(!(Character.isDigit(ch))) {
                evt.consume();
                txtcost.setText("");
                lblcostval.setVisible(true);
                lblcostval.setText("Enter Digits Only");
            } else {
                lblcostval.setVisible(false);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtcostKeyTyped

    private void cbotreatnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotreatnameActionPerformed
            lbllname.setVisible(false);
            txtlname.setVisible(false);
    }//GEN-LAST:event_cbotreatnameActionPerformed

    private void btnpsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpsave1ActionPerformed
    if (txtcost.getText().isEmpty() || cbotreatname.getSelectedItem().equals(""))
           {
           JOptionPane.showMessageDialog(this,"Pls,Enter All Required Inputs","ErrorDialog",JOptionPane.ERROR_MESSAGE);

       }
 else
       {
            try {

            String Name = cbotreatname.getSelectedItem().toString();
            
            mTreatment mt = new mTreatment(txtpatid.getText(),txtpatname.getText(),txttreatid.getText(),Name,Integer.parseInt(txtcost.getText()));
            Controller.UpdateINdatabase(mt, "updateTreatment");
            clearFields();

            //javax.swing.JOptionPane.showMessageDialog(this,"Your Details Have Been Added Succesfully");
            
        } catch (Exception ex) {
          System.out.println(ex.toString());
        }
        }
    }//GEN-LAST:event_btnpsave1ActionPerformed
public void clearFields()
        {
    txtpatid.setText("");
    txtpatname.setText("");
    txttreatid.setText("");
    txtlname.setText("");
    txtcost.setText("");
    cbotreatname.setSelectedItem("");
    
}
    /**
    * @param args the command line arguments
    */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpatback;
    private javax.swing.JButton btnpcancel1;
    private javax.swing.JButton btnpsave1;
    private javax.swing.JComboBox cbotreatname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblcostval;
    private javax.swing.JLabel lbllname;
    private javax.swing.JLabel lblnameval;
    private javax.swing.JTextField txtcost;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtpatid;
    private javax.swing.JTextField txtpatname;
    private javax.swing.JTextField txttreatid;
    // End of variables declaration//GEN-END:variables

}
