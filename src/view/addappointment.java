
package view;
import java.lang.*;
import Controller.Controller;
import Model.mAppointment;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Utility.generatedId;
import java.util.Date;

public class addappointment extends javax.swing.JFrame {
boolean flag;
    private String query;
public Date d;
    /** Creates new form addappointment */
    public addappointment() throws ClassNotFoundException ,ClassCastException {
        initComponents();
        try{
        Calendar currentdate=Calendar.getInstance();
        SimpleDateFormat formatter=new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
        String dateNow=formatter.format(currentdate.getTime());
        txtcurrdate.setText(dateNow);
        }catch(Exception e){}
            query = "SELECT App_id FROM tbl_Appointment";
            txtappid.setText("A"+generatedId.generateID(query));

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlapp = new javax.swing.JPanel();
        pnlpat = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtpatname = new javax.swing.JTextField();
        lblnameval = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblappid = new javax.swing.JLabel();
        lblappdate = new javax.swing.JLabel();
        txtappid = new javax.swing.JTextField();
        lblpic = new javax.swing.JLabel();
        txtcurrdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtapptime = new javax.swing.JTextField();
        txtappdate = new com.toedter.calendar.JDateChooser();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnpatback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD APPOINTMENT");

        pnlapp.setBackground(new java.awt.Color(51, 153, 255));
        pnlapp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));

        pnlpat.setBackground(new java.awt.Color(153, 204, 255));
        pnlpat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true), "PATIENT DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("NAME :");

        txtpatname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpatnameFocusLost(evt);
            }
        });
        txtpatname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpatnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpatnameKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pat1.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));

        javax.swing.GroupLayout pnlpatLayout = new javax.swing.GroupLayout(pnlpat);
        pnlpat.setLayout(pnlpatLayout);
        pnlpatLayout.setHorizontalGroup(
            pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpatLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpatLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnameval)
                    .addComponent(txtpatname, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        pnlpatLayout.setVerticalGroup(
            pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpatLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addGroup(pnlpatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpatname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblnameval)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true), "APPOINTMENT DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(51, 51, 255));

        lblappid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblappid.setForeground(new java.awt.Color(51, 51, 255));
        lblappid.setText("APPOINTMENT ID :");

        lblappdate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblappdate.setForeground(new java.awt.Color(51, 51, 255));
        lblappdate.setText("DATE :");

        txtappid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtappidActionPerformed(evt);
            }
        });
        txtappid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtappidFocusLost(evt);
            }
        });
        txtappid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtappidKeyReleased(evt);
            }
        });

        lblpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app.jpg"))); // NOI18N
        lblpic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        txtcurrdate.setEditable(false);
        txtcurrdate.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("TIME:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addComponent(txtcurrdate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblappid)
                    .addComponent(lblappdate)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpic)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtapptime, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtappid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addComponent(txtappdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblpic)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblappid)
                    .addComponent(txtappid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblappdate)
                    .addComponent(txtappdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapptime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(txtcurrdate)
                .addContainerGap())
        );

        btnsave.setBackground(new java.awt.Color(153, 204, 255));
        btnsave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(51, 51, 255));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addPat.jpg"))); // NOI18N
        btnsave.setText("SAVE");
        btnsave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(153, 204, 255));
        btncancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btncancel.setForeground(new java.awt.Color(51, 51, 255));
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteAppt.JPG"))); // NOI18N
        btncancel.setText("CANCEL");
        btncancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnpatback.setBackground(new java.awt.Color(153, 204, 255));
        btnpatback.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnpatback.setForeground(new java.awt.Color(51, 51, 255));
        btnpatback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.gif"))); // NOI18N
        btnpatback.setText("BACK");
        btnpatback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnpatback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlappLayout = new javax.swing.GroupLayout(pnlapp);
        pnlapp.setLayout(pnlappLayout);
        pnlappLayout.setHorizontalGroup(
            pnlappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlappLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlpat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlappLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(btnpatback, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        pnlappLayout.setVerticalGroup(
            pnlappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlappLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlpat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(pnlappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpatback, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave)
                    .addComponent(btncancel))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        char c=evt.getKeyChar();
        if(!((Character.isLetter(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_SPACE)))
        {
        getToolkit().beep();
        evt.consume();
        lblnameval.setVisible(true);
        }
        else{
        lblnameval.setVisible(false);
        }
    }//GEN-LAST:event_txtpatnameKeyTyped

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        
        txtpatname.setText("");
        txtappid.setText("");
 txtappdate.setDate(null);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnpatbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatbackActionPerformed
        homepage hp=new homepage();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpatbackActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       if (txtpatname.getText().isEmpty() || txtappid.getText().isEmpty() || txtappdate.equals(null) || txtapptime.getText().isEmpty())
                      {
           JOptionPane.showMessageDialog(this,"Pls,Enter All Required Inputs","ErrorDialog",JOptionPane.ERROR_MESSAGE);
       }
    
      else
       {
        try {            
                    mAppointment m = new mAppointment(txtappid.getText(), txtpatname.getText(), txtappdate.getDate().toString(),txtapptime.getText());
                    Controller.Addtodatabase(m, "addAppointment");
                    clear();
                    txtappid.setText("A" + generatedId.generateID(query));

                   
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(addappointment.class.getName()).log(Level.SEVERE, null, ex);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(addappointment.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_btnsaveActionPerformed
    }
    private void txtpatnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpatnameKeyReleased
        if(txtpatname.getText().length() > 30)
       {
                JOptionPane.showMessageDialog(null, "To Large Name", "Error", JOptionPane.ERROR_MESSAGE);
                txtpatname.setText("");
       }
       
    }//GEN-LAST:event_txtpatnameKeyReleased

    private void txtappidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtappidKeyReleased

    }//GEN-LAST:event_txtappidKeyReleased

    private void txtpatnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpatnameFocusLost
        
    }//GEN-LAST:event_txtpatnameFocusLost

    private void txtappidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtappidFocusLost
       
    }//GEN-LAST:event_txtappidFocusLost

    private void txtapptimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapptimeKeyReleased
           
    }//GEN-LAST:event_txtapptimeKeyReleased

    private void txtapptimeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapptimeMouseExited
         
    }//GEN-LAST:event_txtapptimeMouseExited

    private void txtapptimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapptimeFocusLost
        String regex = "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";
            Pattern p =Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
            Matcher ma = p.matcher(txtapptime.getText()); // get a matcher object
            boolean matchFound = ma.matches();
            if (matchFound == false)
            {
                JOptionPane.showMessageDialog(null, "Invalid Time!", "Error", JOptionPane.ERROR_MESSAGE );
                txtapptime.setText("");
            }
    }//GEN-LAST:event_txtapptimeFocusLost

    private void txtappidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtappidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtappidActionPerformed
 public void clear()
    {
        txtappid.setText("");
        txtpatname.setText("");
        txtappdate.setDate(null);
        txtapptime.setText("");
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnpatback;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblappdate;
    private javax.swing.JLabel lblappid;
    private javax.swing.JLabel lblnameval;
    private javax.swing.JLabel lblpic;
    private javax.swing.JPanel pnlapp;
    private javax.swing.JPanel pnlpat;
    private com.toedter.calendar.JDateChooser txtappdate;
    private javax.swing.JTextField txtappid;
    private javax.swing.JTextField txtapptime;
    private javax.swing.JTextField txtcurrdate;
    private javax.swing.JTextField txtpatname;
    // End of variables declaration//GEN-END:variables
}
