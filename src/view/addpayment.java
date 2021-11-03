package view;

import Controller.Controller;
import DB.DbConnection;
import Model.mPayment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class addpayment extends javax.swing.JFrame {
Connection con;
PreparedStatement pst;
Statement st;
ResultSet rs;
    /** Creates new form addpayment */
    public addpayment() {
        
            initComponents();
          
         mPayment o1 = new mPayment(cbopatid,rdopatid);
    }

     public int Amt()
     {
         int tamt= Integer.parseInt(txtcharge.getText());
         int pamt=Integer.parseInt(txtpaid.getText());
         int bal=tamt-pamt;
         return bal;
     }
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
        rdopatid = new javax.swing.JRadioButton();
        cbopatid = new javax.swing.JComboBox();
        btnsearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtcharge = new javax.swing.JTextField();
        lblcostval = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpaid = new javax.swing.JTextField();
        lblpaidval = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();
        lblbalval = new javax.swing.JLabel();
        txttreatname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttreatid = new javax.swing.JTextField();
        btnpsave1 = new javax.swing.JButton();
        btnpcancel1 = new javax.swing.JButton();
        btnpatback = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnexist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD PAYMENT");

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

        rdopatid.setBackground(new java.awt.Color(153, 204, 255));
        rdopatid.setFont(new java.awt.Font("Arial", 1, 18));
        rdopatid.setForeground(new java.awt.Color(51, 51, 255));
        rdopatid.setText("PATIENT ID :");
        rdopatid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdopatidActionPerformed(evt);
            }
        });

        cbopatid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbopatid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbopatidItemStateChanged(evt);
            }
        });
        cbopatid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbopatidActionPerformed(evt);
            }
        });

        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gSearch1.jpg"))); // NOI18N
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(rdopatid))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbopatid, 0, 138, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsearch)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnameval)
                            .addComponent(txtpatname, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(87, 87, 87))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtpatid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(103, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdopatid)
                            .addComponent(cbopatid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtpatid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtpatname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(lblnameval)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnsearch, 0, 0, Short.MAX_VALUE)
                        .addGap(108, 108, 108))))
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true), "PAYMENT DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("TREATMENT CHARGES :");

        txtcharge.setEditable(false);
        txtcharge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtchargeKeyTyped(evt);
            }
        });

        lblcostval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblcostvalKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("TREATMENT NAME :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("AMOUNT PAID :");

        txtpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaidActionPerformed(evt);
            }
        });
        txtpaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpaidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpaidKeyTyped(evt);
            }
        });

        lblpaidval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblpaidvalKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("BALANCE AMOUNT :");

        txtbalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbalanceKeyTyped(evt);
            }
        });

        lblbalval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblbalvalKeyTyped(evt);
            }
        });

        txttreatname.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("TREATMENT ID :");

        txttreatid.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblbalval)
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(lblpaidval)
                                    .addContainerGap())
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblcostval)
                                        .addContainerGap())
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtpaid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(txtbalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(txtcharge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(txttreatname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(txttreatid, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                        .addGap(107, 107, 107))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(345, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttreatid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttreatname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblcostval)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblpaidval)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblbalval)
                .addGap(19, 19, 19))
        );

        btnpsave1.setBackground(new java.awt.Color(153, 204, 255));
        btnpsave1.setFont(new java.awt.Font("Arial", 1, 24));
        btnpsave1.setForeground(new java.awt.Color(51, 51, 255));
        btnpsave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rupee-icon.png"))); // NOI18N
        btnpsave1.setText("SAVE");
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
        btnpatback.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnpatback.setForeground(new java.awt.Color(51, 51, 255));
        btnpatback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.gif"))); // NOI18N
        btnpatback.setText("BACK");
        btnpatback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnpatback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatbackActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payhere.jpg"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));

        btnexist.setBackground(new java.awt.Color(153, 204, 255));
        btnexist.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnexist.setForeground(new java.awt.Color(51, 51, 255));
        btnexist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pathis1.jpg"))); // NOI18N
        btnexist.setText("Existing patient");
        btnexist.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnexist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnpsave1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(btnpcancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(btnpatback, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnexist, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnexist)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpatback, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpcancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpsave1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblnamevalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblnamevalKeyTyped
        
}//GEN-LAST:event_lblnamevalKeyTyped

    private void lblcostvalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblcostvalKeyTyped
       
}//GEN-LAST:event_lblcostvalKeyTyped

    private void btnpcancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpcancel1ActionPerformed

}//GEN-LAST:event_btnpcancel1ActionPerformed

    private void btnpatbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatbackActionPerformed


        homepage hp=new homepage();
        hp.setVisible(true);
        this.dispose();
}//GEN-LAST:event_btnpatbackActionPerformed

    private void lblpaidvalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblpaidvalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lblpaidvalKeyTyped

    private void lblbalvalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblbalvalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lblbalvalKeyTyped

    private void txtpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaidActionPerformed

    }//GEN-LAST:event_txtpaidActionPerformed

    private void txtpaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaidKeyTyped
        try {
            char ch =evt.getKeyChar();
            if(!(Character.isDigit(ch))) {
                evt.consume();
                txtpaid.setText("");
                lblpaidval.setVisible(true);
                lblpaidval.setText("Enter Digits Only");
            } else {
                lblpaidval.setVisible(false);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtpaidKeyTyped

    private void txtbalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbalanceKeyTyped
       try {
            char ch =evt.getKeyChar();
            if(!(Character.isDigit(ch))) {
                evt.consume();
                txtbalance.setText("");
                lblbalval.setVisible(true);
                lblbalval.setText("Enter Digits Only");
            } else {
                lblbalval.setVisible(false);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtbalanceKeyTyped

    private void txtchargeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtchargeKeyTyped
         try {
            char ch =evt.getKeyChar();
            if(!(Character.isDigit(ch))) {
                evt.consume();
                txtcharge.setText("");
                lblcostval.setVisible(true);
                lblcostval.setText("Enter Digits Only");
            } else {
                lblcostval.setVisible(false);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtchargeKeyTyped

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

    private void txtpaidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaidKeyReleased
       txtbalance.setText(Integer.toString(Amt()));
    }//GEN-LAST:event_txtpaidKeyReleased

    private void btnpsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpsave1ActionPerformed
        if (txtpaid.getText().isEmpty() || txtbalance.getText().isEmpty())
           {
           JOptionPane.showMessageDialog(this,"Pls,Enter All Required Inputs","ErrorDialog",JOptionPane.ERROR_MESSAGE);

       }
 else
       {
        try {
            mPayment mT = new mPayment(txtpatid.getText(),txtpatname.getText(),txttreatid.getText(),Integer.parseInt(txtcharge.getText()), Integer.parseInt(txtpaid.getText()),Integer.parseInt(txtbalance.getText()));
            Controller.Addtodatabase(mT, "addPayment");
            clear();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addpayment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addpayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpsave1ActionPerformed
    }
    private void rdopatidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdopatidActionPerformed
        try {
            Connection con = DbConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=st.executeQuery("select Pat_id from tbl_PatientDetails ");
            while (rs.next()) {
                cbopatid.addItem(rs.getString(1));

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addpayment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addtreatment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rdopatidActionPerformed

    private void cbopatidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbopatidItemStateChanged
       
        }//GEN-LAST:event_cbopatidItemStateChanged

        private void cbopatidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbopatidActionPerformed
        if(cbopatid.getSelectedItem()==null) {

            btnsearch.disable();
        }
        }//GEN-LAST:event_cbopatidActionPerformed

        private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
          try {
               Connection con = DbConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            String cbo=cbopatid.getSelectedItem().toString();
            st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=st.executeQuery("select tbl_PatientDetails.Pat_id,tbl_PatientDetails.Pat_name,T_id,T_name,T_cost from tbl_PatientDetails,tbl_Treatment where tbl_PatientDetails.Pat_id=tbl_Treatment.Pat_id and tbl_PatientDetails.Pat_id='"+cbo+"' ");

            while (rs.next()) {
                txtpatid.setText(rs.getString("Pat_id"));
                txtpatname.setText(rs.getString("Pat_name"));
               txttreatid.setText(rs.getString("T_id"));
                txttreatname.setText(rs.getString("T_name"));
                txtcharge.setText(rs.getString("T_cost"));
                

            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(addpayment.class.getName()).log(Level.SEVERE, null, ex);
        }            catch (SQLException ex) {
            Logger.getLogger(addpayment.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnsearchActionPerformed

        private void btnexistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexistActionPerformed
                   if (txtpaid.getText().isEmpty() || txtbalance.getText().isEmpty())
           {
           JOptionPane.showMessageDialog(this,"Pls,Enter All Required Inputs","ErrorDialog",JOptionPane.ERROR_MESSAGE);

       }
 else
       {
        try {
           con = DbConnection.getConnection();
                PreparedStatement statement = con.prepareStatement("update tbl_Payment set Pat_id=?,Pat_name=?,T_id=?,T_charge=?,Paid_amt=?,Balance_amt=? where Pat_id='"+txtpatid.getText()+"'");
                statement.setString(1,txtpatid.getText());
                statement.setString(2,txtpatname.getText());
                statement.setString(3,txttreatid.getText());
                statement.setString(4,txtcharge.getText());
                statement.setString(5,txtpaid.getText());
                statement.setString(6,txtbalance.getText());
                statement.execute();
                JOptionPane.showMessageDialog(null,"Record Saved Sucessfully");
                clear();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addpayment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addpayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        }//GEN-LAST:event_btnexistActionPerformed

    public void clear()
{
    txtcharge.setText("");
    txtpatid.setText("");
    txtpatname.setText("");
    txtbalance.setText("");
    txtpaid.setText("");
    
    txttreatid.setText("");
    txttreatname.setText("");
    
}
   /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexist;
    private javax.swing.JButton btnpatback;
    private javax.swing.JButton btnpcancel1;
    private javax.swing.JButton btnpsave1;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox cbopatid;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblbalval;
    private javax.swing.JLabel lblcostval;
    private javax.swing.JLabel lblnameval;
    private javax.swing.JLabel lblpaidval;
    private javax.swing.JRadioButton rdopatid;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcharge;
    private javax.swing.JTextField txtpaid;
    private javax.swing.JTextField txtpatid;
    private javax.swing.JTextField txtpatname;
    private javax.swing.JTextField txttreatid;
    private javax.swing.JTextField txttreatname;
    // End of variables declaration//GEN-END:variables
}
