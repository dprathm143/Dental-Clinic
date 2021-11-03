package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class homepage extends javax.swing.JFrame {

    /* Creates new form homepage */
    public homepage() {
        initComponents();
        mnLyrPane.setVisible(false);
        pnpic.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnLyrPane = new javax.swing.JLayeredPane();
        btnaddappointment = new javax.swing.JButton();
        btnupdateappointment = new javax.swing.JButton();
        btndeleteappointment = new javax.swing.JButton();
        btnaddpatient = new javax.swing.JButton();
        btnupdatepatient = new javax.swing.JButton();
        btnshowappointments = new javax.swing.JButton();
        btnaddtreatment = new javax.swing.JButton();
        btnupdatetreatment = new javax.swing.JButton();
        btnaddpayment = new javax.swing.JButton();
        btnupdatepayment = new javax.swing.JButton();
        btnshowallpatients = new javax.swing.JButton();
        pnpic = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnAppoint = new javax.swing.JMenu();
        mnPatient = new javax.swing.JMenu();
        mnTreatment = new javax.swing.JMenu();
        mnPayment = new javax.swing.JMenu();
        mnreport = new javax.swing.JMenu();
        mnexit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME PAGE");

        mnLyrPane.setBackground(new java.awt.Color(153, 204, 255));
        mnLyrPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));

        btnaddappointment.setBackground(new java.awt.Color(153, 204, 255));
        btnaddappointment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnaddappointment.setForeground(new java.awt.Color(51, 51, 255));
        btnaddappointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddApp.jpg"))); // NOI18N
        btnaddappointment.setText("ADD APPOINTMENT");
        btnaddappointment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btnaddappointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddappointmentActionPerformed(evt);
            }
        });
        mnLyrPane.add(btnaddappointment);
        btnaddappointment.setBounds(30, 20, 260, 90);

        btnupdateappointment.setBackground(new java.awt.Color(153, 204, 255));
        btnupdateappointment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnupdateappointment.setForeground(new java.awt.Color(51, 51, 255));
        btnupdateappointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddAppt.JPG"))); // NOI18N
        btnupdateappointment.setText("UPDATE APPOINTMENT");
        btnupdateappointment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btnupdateappointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateappointmentActionPerformed(evt);
            }
        });
        mnLyrPane.add(btnupdateappointment);
        btnupdateappointment.setBounds(30, 160, 260, 90);

        btndeleteappointment.setBackground(new java.awt.Color(153, 204, 255));
        btndeleteappointment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btndeleteappointment.setForeground(new java.awt.Color(51, 51, 255));
        btndeleteappointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteAppt.JPG"))); // NOI18N
        btndeleteappointment.setText("DELETE APPOINTMENT");
        btndeleteappointment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btndeleteappointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteappointmentActionPerformed(evt);
            }
        });
        mnLyrPane.add(btndeleteappointment);
        btndeleteappointment.setBounds(30, 300, 260, 90);

        btnaddpatient.setBackground(new java.awt.Color(153, 204, 255));
        btnaddpatient.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnaddpatient.setForeground(new java.awt.Color(51, 51, 255));
        btnaddpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddPatient.JPG"))); // NOI18N
        btnaddpatient.setText("ADD PATIENT");
        btnaddpatient.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btnaddpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddpatientActionPerformed(evt);
            }
        });
        mnLyrPane.add(btnaddpatient);
        btnaddpatient.setBounds(20, 20, 260, 90);

        btnupdatepatient.setBackground(new java.awt.Color(153, 204, 255));
        btnupdatepatient.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnupdatepatient.setForeground(new java.awt.Color(51, 51, 255));
        btnupdatepatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnPatDetls.gif"))); // NOI18N
        btnupdatepatient.setText("UPDATE PATIENT");
        btnupdatepatient.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btnupdatepatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatepatientActionPerformed(evt);
            }
        });
        mnLyrPane.add(btnupdatepatient);
        btnupdatepatient.setBounds(30, 160, 260, 90);

        btnshowappointments.setBackground(new java.awt.Color(153, 204, 255));
        btnshowappointments.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnshowappointments.setForeground(new java.awt.Color(51, 51, 255));
        btnshowappointments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.jpg"))); // NOI18N
        btnshowappointments.setText("SHOW APPOINTMENTS");
        btnshowappointments.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btnshowappointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowappointmentsActionPerformed(evt);
            }
        });
        mnLyrPane.add(btnshowappointments);
        btnshowappointments.setBounds(30, 450, 260, 90);

        btnaddtreatment.setBackground(new java.awt.Color(153, 204, 255));
        btnaddtreatment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnaddtreatment.setForeground(new java.awt.Color(51, 51, 255));
        btnaddtreatment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ADDFINAL.jpg"))); // NOI18N
        btnaddtreatment.setText("ADD TREATMENT");
        btnaddtreatment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btnaddtreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddtreatmentActionPerformed(evt);
            }
        });
        mnLyrPane.add(btnaddtreatment);
        btnaddtreatment.setBounds(20, 20, 260, 90);

        btnupdatetreatment.setBackground(new java.awt.Color(153, 204, 255));
        btnupdatetreatment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnupdatetreatment.setForeground(new java.awt.Color(51, 51, 255));
        btnupdatetreatment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/treat.JPG"))); // NOI18N
        btnupdatetreatment.setText("UPDATE TREATMENT");
        btnupdatetreatment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btnupdatetreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatetreatmentActionPerformed(evt);
            }
        });
        mnLyrPane.add(btnupdatetreatment);
        btnupdatetreatment.setBounds(30, 160, 260, 90);

        btnaddpayment.setBackground(new java.awt.Color(153, 204, 255));
        btnaddpayment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnaddpayment.setForeground(new java.awt.Color(51, 51, 255));
        btnaddpayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pay1.JPG"))); // NOI18N
        btnaddpayment.setText("ADD PAYMENT DETAILS");
        btnaddpayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btnaddpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddpaymentActionPerformed(evt);
            }
        });
        mnLyrPane.add(btnaddpayment);
        btnaddpayment.setBounds(20, 20, 280, 90);

        btnupdatepayment.setBackground(new java.awt.Color(153, 204, 255));
        btnupdatepayment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnupdatepayment.setForeground(new java.awt.Color(51, 51, 255));
        btnupdatepayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UpdateIcon.png"))); // NOI18N
        btnupdatepayment.setText("UPDATE PAYMENT DETAILS");
        btnupdatepayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btnupdatepayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatepaymentActionPerformed(evt);
            }
        });
        mnLyrPane.add(btnupdatepayment);
        btnupdatepayment.setBounds(30, 160, 260, 90);

        btnshowallpatients.setBackground(new java.awt.Color(153, 204, 255));
        btnshowallpatients.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnshowallpatients.setForeground(new java.awt.Color(51, 51, 255));
        btnshowallpatients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gSearch1.jpg"))); // NOI18N
        btnshowallpatients.setText("SHOW ALL PATIENTS");
        btnshowallpatients.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        btnshowallpatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowallpatientsActionPerformed(evt);
            }
        });
        mnLyrPane.add(btnshowallpatients);
        btnshowallpatients.setBounds(30, 300, 260, 90);

        pnpic.setBackground(new java.awt.Color(51, 153, 255));
        pnpic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mr-Tooth_2.jpg"))); // NOI18N

        javax.swing.GroupLayout pnpicLayout = new javax.swing.GroupLayout(pnpic);
        pnpic.setLayout(pnpicLayout);
        pnpicLayout.setHorizontalGroup(
            pnpicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpicLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        pnpicLayout.setVerticalGroup(
            pnpicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpicLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));
        jMenuBar1.setForeground(new java.awt.Color(102, 153, 255));

        mnAppoint.setBackground(new java.awt.Color(153, 204, 255));
        mnAppoint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        mnAppoint.setForeground(new java.awt.Color(51, 51, 255));
        mnAppoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/temporary-tooth.gif"))); // NOI18N
        mnAppoint.setText("APPOINTMENT");
        mnAppoint.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnAppoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnAppointMouseClicked(evt);
            }
        });
        mnAppoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAppointActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnAppoint);

        mnPatient.setBackground(new java.awt.Color(153, 204, 255));
        mnPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        mnPatient.setForeground(new java.awt.Color(51, 51, 255));
        mnPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patienticon.jpg"))); // NOI18N
        mnPatient.setText("PATIENT");
        mnPatient.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPatientMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPatient);

        mnTreatment.setBackground(new java.awt.Color(153, 204, 255));
        mnTreatment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        mnTreatment.setForeground(new java.awt.Color(51, 51, 255));
        mnTreatment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dentalplus.JPG"))); // NOI18N
        mnTreatment.setText("TREATMENT");
        mnTreatment.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnTreatment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnTreatmentMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnTreatment);

        mnPayment.setBackground(new java.awt.Color(153, 204, 255));
        mnPayment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        mnPayment.setForeground(new java.awt.Color(51, 51, 255));
        mnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money-icon1.png"))); // NOI18N
        mnPayment.setText("PAYMENT");
        mnPayment.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPaymentMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPayment);

        mnreport.setBackground(new java.awt.Color(153, 204, 255));
        mnreport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        mnreport.setForeground(new java.awt.Color(51, 51, 255));
        mnreport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddApp.jpg"))); // NOI18N
        mnreport.setText("REPORT");
        mnreport.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnreportMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnreport);

        mnexit.setBackground(new java.awt.Color(153, 204, 255));
        mnexit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        mnexit.setForeground(new java.awt.Color(51, 51, 255));
        mnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        mnexit.setText("EXIT");
        mnexit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnexitMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnexit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mnLyrPane, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnLyrPane, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(pnpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnAppointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAppointMouseClicked
        mnLyrPane.setVisible(true);
        pnpic.setVisible(true);
        btnaddappointment.setEnabled(true);
        btnupdateappointment.setEnabled(true);
        btndeleteappointment.setEnabled(true);
        btnshowappointments.setEnabled(true);
        btnaddappointment.setVisible(true);
        btnupdateappointment.setVisible(true);
        btndeleteappointment.setVisible(true);
       btnaddpatient.setVisible(false);
       btnupdatepatient.setVisible(false);
       btnshowappointments.setVisible(true);
       btnaddtreatment.setVisible(false);
       btnupdatetreatment.setVisible(false);
        btnshowallpatients.setEnabled(false);
        btnshowallpatients.setVisible(false);
       btnaddpayment.setVisible(false);
       btnupdatepayment.setVisible(false);
        
    }//GEN-LAST:event_mnAppointMouseClicked

    private void mnPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPatientMouseClicked
        mnLyrPane.setVisible(true);
         pnpic.setVisible(true);
        btnaddpatient.setEnabled(true);
        btnupdatepatient.setEnabled(true);
        btnshowappointments.setEnabled(false);
        btnaddpatient.setVisible(true);
        btnupdatepatient.setVisible(true);
        btnshowappointments.setVisible(false);
        btnaddappointment.setVisible(false);
        btnaddpayment.setVisible(false);
        btnaddtreatment.setVisible(false);
        btndeleteappointment.setVisible(false);
        btnshowallpatients.setEnabled(true);
        btnshowallpatients.setVisible(true);
        btnupdateappointment.setVisible(false);
        btnupdatepayment.setVisible(false);
        btnupdatetreatment.setVisible(false);
        
    }//GEN-LAST:event_mnPatientMouseClicked

    private void mnTreatmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTreatmentMouseClicked
        mnLyrPane.setVisible(true);
         pnpic.setVisible(true);
        btnaddtreatment.setEnabled(true);
        btnupdatetreatment.setEnabled(true);
        
        btnaddpatient.setVisible(false);
        btnupdatepatient.setVisible(false);
        btnshowappointments.setVisible(false);
        btnaddappointment.setVisible(false);
        btnaddpayment.setVisible(false);
        btnaddtreatment.setVisible(true);
        btndeleteappointment.setVisible(false);
         btnshowallpatients.setEnabled(false);
        btnshowallpatients.setVisible(false);
        btnupdateappointment.setVisible(false);
        btnupdatepayment.setVisible(false);
        btnupdatetreatment.setVisible(true);
    }//GEN-LAST:event_mnTreatmentMouseClicked

    private void mnPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPaymentMouseClicked
        mnLyrPane.setVisible(true);
         pnpic.setVisible(true);
        btnaddpayment.setEnabled(true);
        btnupdatepayment.setEnabled(true);
        btnaddpatient.setVisible(false);
        btnupdatepatient.setVisible(false);
        btnshowappointments.setVisible(false);
        btnaddappointment.setVisible(false);
        btnaddpayment.setVisible(true);
        btnaddtreatment.setVisible(false);
        btndeleteappointment.setVisible(false);
         btnshowallpatients.setEnabled(false);
        btnshowallpatients.setVisible(false);
        btnupdateappointment.setVisible(false);
        btnupdatepayment.setVisible(true);
        btnupdatetreatment.setVisible(false);
    }//GEN-LAST:event_mnPaymentMouseClicked

    private void btnaddpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddpatientActionPerformed
        try {
            addpatient pat1 = new addpatient();
            pat1.setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btnaddpatientActionPerformed

    private void btnaddappointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddappointmentActionPerformed
        try {
            addappointment app1 = new addappointment();
            app1.setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassCastException ex) {
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddappointmentActionPerformed

    private void mnAppointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAppointActionPerformed
      
    }//GEN-LAST:event_mnAppointActionPerformed

    private void btnupdatepatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatepatientActionPerformed
        
            getpatient pat2 = new getpatient();
            pat2.setVisible(true);
            this.dispose();
         
    }//GEN-LAST:event_btnupdatepatientActionPerformed

    private void btnshowappointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowappointmentsActionPerformed
        showpatientappointments pat3=new showpatientappointments();
        pat3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnshowappointmentsActionPerformed

    private void btnupdateappointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateappointmentActionPerformed
       updateappointment app2=new updateappointment();
       app2.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnupdateappointmentActionPerformed

    private void btndeleteappointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteappointmentActionPerformed
        deleteappointment app3=new deleteappointment();
        app3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndeleteappointmentActionPerformed

    private void btnaddtreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddtreatmentActionPerformed
        try {
            addtreatment tre1 = new addtreatment();
            tre1.setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddtreatmentActionPerformed

    private void btnupdatetreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatetreatmentActionPerformed
       gettreatment tre2=new gettreatment();
        tre2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnupdatetreatmentActionPerformed

    private void btnaddpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddpaymentActionPerformed
        addpayment pay1=new addpayment();
        pay1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnaddpaymentActionPerformed

    private void btnupdatepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatepaymentActionPerformed
        getpayment pay2=new getpayment();
         pay2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnupdatepaymentActionPerformed

    private void mnexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnexitMouseClicked
        exit e=new exit();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnexitMouseClicked

    private void mnreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnreportMouseClicked
        report r=new report();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnreportMouseClicked

    private void btnshowallpatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowallpatientsActionPerformed
        showallpatients sp=new showallpatients();
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnshowallpatientsActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddappointment;
    private javax.swing.JButton btnaddpatient;
    private javax.swing.JButton btnaddpayment;
    private javax.swing.JButton btnaddtreatment;
    private javax.swing.JButton btndeleteappointment;
    private javax.swing.JButton btnshowallpatients;
    private javax.swing.JButton btnshowappointments;
    private javax.swing.JButton btnupdateappointment;
    private javax.swing.JButton btnupdatepatient;
    private javax.swing.JButton btnupdatepayment;
    private javax.swing.JButton btnupdatetreatment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnAppoint;
    private javax.swing.JLayeredPane mnLyrPane;
    private javax.swing.JMenu mnPatient;
    private javax.swing.JMenu mnPayment;
    private javax.swing.JMenu mnTreatment;
    private javax.swing.JMenu mnexit;
    private javax.swing.JMenu mnreport;
    private javax.swing.JPanel pnpic;
    // End of variables declaration//GEN-END:variables
}
