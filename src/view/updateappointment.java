/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * updateappointment.java
 *
 * Created on Dec 23, 2011, 3:20:15 PM
 */

package view;


import Controller.Controller;
import DB.DbConnection;
import Model.mAppointment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author abc
 */
public class updateappointment extends javax.swing.JFrame {
private boolean flag;
    /** Creates new form updateappointment */
    public updateappointment() {
        initComponents();
        mAppointment o1 = new mAppointment(cboappid);
            

            lblpatname.setVisible(false);
            txtappid.setVisible(false);
            txtpatname.setVisible(false);
            lblapp.setVisible(false);
            lblappdate.setVisible(false);
            txtappdate.setVisible(false);
            btnsearch.setEnabled(false);
            txtapptime.setVisible(false);
            lblapptime.setVisible(false);
//            btnCancel.setEnabled(false);
            btnupdate.setEnabled(false);
            txtdate.setVisible(false);

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
        pnlpat = new javax.swing.JPanel();
        lblpatname = new javax.swing.JLabel();
        txtpatname = new javax.swing.JTextField();
        lblnameval = new javax.swing.JLabel();
        lblapp = new javax.swing.JLabel();
        txtappid = new javax.swing.JTextField();
        cboappid = new javax.swing.JComboBox();
        rdoappid = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblappdate = new javax.swing.JLabel();
        lblpic = new javax.swing.JLabel();
        lblapptime = new javax.swing.JLabel();
        txtapptime = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtappdate = new com.toedter.calendar.JDateChooser();
        btnupdate = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnpatback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UPDATE APPOINTMENT");

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));

        pnlpat.setBackground(new java.awt.Color(153, 204, 255));
        pnlpat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true), "PATIENT DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        lblpatname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblpatname.setForeground(new java.awt.Color(51, 51, 255));
        lblpatname.setText("NAME :");

        txtpatname.setEditable(false);
        txtpatname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpatnameKeyTyped(evt);
            }
        });

        lblapp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblapp.setForeground(new java.awt.Color(51, 51, 255));
        lblapp.setText("APPOINTMENT ID :");

        txtappid.setEditable(false);

        cboappid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboappidItemStateChanged(evt);
            }
        });
        cboappid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboappidActionPerformed(evt);
            }
        });
        cboappid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboappidFocusLost(evt);
            }
        });

        rdoappid.setBackground(new java.awt.Color(153, 204, 255));
        rdoappid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdoappid.setForeground(new java.awt.Color(51, 51, 255));
        rdoappid.setText("APPOINTMENT ID:");
        rdoappid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoappidActionPerformed(evt);
            }
        });
        rdoappid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rdoappidFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnlpatLayout = new javax.swing.GroupLayout(pnlpat);
        pnlpat.setLayout(pnlpatLayout);
        pnlpatLayout.setHorizontalGroup(
            pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpatLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblapp)
                    .addComponent(rdoappid)
                    .addComponent(lblpatname))
                .addGap(18, 18, 18)
                .addGroup(pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlpatLayout.createSequentialGroup()
                        .addComponent(cboappid, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlpatLayout.createSequentialGroup()
                            .addComponent(lblnameval)
                            .addContainerGap())
                        .addGroup(pnlpatLayout.createSequentialGroup()
                            .addGroup(pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtpatname)
                                .addComponent(txtappid, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(58, 58, 58)))))
        );
        pnlpatLayout.setVerticalGroup(
            pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpatLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboappid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoappid))
                .addGap(47, 47, 47)
                .addGroup(pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpatname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpatname))
                .addGap(27, 27, 27)
                .addComponent(lblnameval)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblapp)
                    .addComponent(txtappid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true), "APPOINTMENT DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        lblappdate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblappdate.setForeground(new java.awt.Color(51, 51, 255));
        lblappdate.setText("DATE :");

        lblpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app2.JPG"))); // NOI18N
        lblpic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));

        lblapptime.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblapptime.setForeground(new java.awt.Color(51, 51, 255));
        lblapptime.setText("TIME:");

        txtapptime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtapptimeMouseExited(evt);
            }
        });
        txtapptime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtapptimeFocusLost(evt);
            }
        });
        txtapptime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtapptimeKeyReleased(evt);
            }
        });

        txtdate.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblappdate)
                            .addComponent(lblapptime))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtapptime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtappdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(117, Short.MAX_VALUE)
                        .addComponent(lblpic)))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblappdate)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtappdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblapptime)
                    .addComponent(txtapptime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        btnupdate.setBackground(new java.awt.Color(153, 204, 255));
        btnupdate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(51, 51, 255));
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh.jpg"))); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(153, 204, 255));
        btnsearch.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(51, 51, 255));
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gSearch1.jpg"))); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlpat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnpatback, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlpat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpatback, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        int cnt1=cboappid.getItemCount();
        int i1=cboappid.getSelectedIndex();
        if(cnt1==0)
        {
            JOptionPane.showMessageDialog(null,"There is no Appointment to fill Patient details");
        }
        else if(i1==-1)
            {
              JOptionPane.showMessageDialog(null,"Please Select patient to insert its  details!!!");
            }

        else
        {
        btnupdate.setEnabled(true);
        //btnCancel.setEnabled(true);
        lblapp.setVisible(true);
        txtappid.setVisible(true);
        lblappdate.setVisible(true);
        lblapptime.setVisible(true);
        txtappdate.setVisible(true);
        txtapptime.setVisible(true);
        txtdate.setVisible(true);

                if (rdoappid.isSelected()) {
                    try {
                        rdoappid.setText("App_id");

                        rdoappid.setVisible(false);

                        cboappid.setVisible(false);
                        lblpatname.setVisible(true);

                        txtpatname.setVisible(true);
                        String rdoname = rdoappid.getText();
                        String cboname = cboappid.getSelectedItem().toString();
                        Connection con = DbConnection.getConnection();
                        PreparedStatement ps = con.prepareStatement("Select * from tbl_Appointment where " + rdoname + " = '" + cboname + "'");
                        ResultSet rs = ps.executeQuery();
                        while (rs.next()) {
                            String Appid = rs.getString("App_id");
                            txtappid.setText("" + Appid);
                            String patname = rs.getString("Pat_name");
                             txtpatname.setText("" + patname);
                            String Appdate = rs.getString("App_date");
                            txtdate.setText("" + Appdate);
                            String apptime = rs.getString("App_time");
                             txtapptime.setText("" + apptime);

                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(updateappointment.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(updateappointment.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
        btnsearch.setEnabled(false);
       

    }//GEN-LAST:event_btnsearchActionPerformed
public void clearFields()
    {
        txtappid.setText("");

        txtpatname.setText("");
        txtappdate.setDate(null);
        txtapptime.setText("");
        txtdate.setText("");
    }
    private void btnpatbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatbackActionPerformed


       homepage hp=new homepage();
        hp.setVisible(true);
        this.dispose();
}//GEN-LAST:event_btnpatbackActionPerformed

    private void rdoappidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoappidActionPerformed
         try {
            btnsearch.setEnabled(true);
            lblpatname.setVisible(false);
            txtpatname.setVisible(false);

            cboappid.removeAllItems();
            Connection con = DbConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery("select App_id from tbl_Appointment");
            while (rs.next()) {
                cboappid.addItem(rs.getString(1));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(updateappointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(updateappointment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_rdoappidActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
         if (txtappdate.equals(null)||txtapptime.getText().isEmpty())
           {
           JOptionPane.showMessageDialog(this,"Pls,Enter the Date","ErrorDialog",JOptionPane.ERROR_MESSAGE);
       }
         else
       {
        try {
                mAppointment AppObj = new mAppointment(txtappdate.getDate().toString(),txtapptime.getText());
                Controller.UpdateINdatabase(AppObj, "updateAppointment");
               
               
                 clearFields();
                mAppointment o1 = new mAppointment(cboappid);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(updateappointment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(updateappointment.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnupdateActionPerformed
    }
    private void cboappidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboappidActionPerformed
         if(cboappid.getSelectedItem()==null)
        {
            btnsearch.disable();
            btnupdate.disable();
        }
    }//GEN-LAST:event_cboappidActionPerformed

    private void cboappidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboappidItemStateChanged
        btnsearch.setEnabled(true);

    }//GEN-LAST:event_cboappidItemStateChanged

    private void rdoappidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rdoappidFocusLost

    }//GEN-LAST:event_rdoappidFocusLost

    private void cboappidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboappidFocusLost
       if (cboappid.getSelectedItem().equals(""))
        {
                JOptionPane.showMessageDialog(null, "Plz select", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cboappidFocusLost

    private void txtapptimeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapptimeMouseExited

}//GEN-LAST:event_txtapptimeMouseExited

    private void txtapptimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapptimeFocusLost
        String regex = "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";
        Pattern p =Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(txtapptime.getText()); // get a matcher object
        boolean matchFound = m.matches();
        if (matchFound == false) {
            JOptionPane.showMessageDialog(null, "Invalid Time!", "Error", JOptionPane.ERROR_MESSAGE );
            txtapptime.setText("");
        }
}//GEN-LAST:event_txtapptimeFocusLost

    private void txtapptimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapptimeKeyReleased

}//GEN-LAST:event_txtapptimeKeyReleased

    /**
    * @param args the command line arguments
    */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpatback;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cboappid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblapp;
    private javax.swing.JLabel lblappdate;
    private javax.swing.JLabel lblapptime;
    private javax.swing.JLabel lblnameval;
    private javax.swing.JLabel lblpatname;
    private javax.swing.JLabel lblpic;
    private javax.swing.JPanel pnlpat;
    private javax.swing.JRadioButton rdoappid;
    private com.toedter.calendar.JDateChooser txtappdate;
    private javax.swing.JTextField txtappid;
    private javax.swing.JTextField txtapptime;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtpatname;
    // End of variables declaration//GEN-END:variables

}
