package view;

import Controller.Controller;
import Model.mPatient;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import Utility.generatedId;

import javax.swing.JOptionPane;

public class addpatient extends javax.swing.JFrame {
    private String query;

Connection con;
    /** Creates new form addpatient */
    public addpatient()throws ClassNotFoundException, SQLException {
         initComponents();
         try
         {
                   btnpsave.setVisible(true);    
         }
         catch(Exception e){}
        lblpnameval.setVisible(false);
        lblpageval.setVisible(false);
        lblpcontactval.setVisible(false);
         query = "SELECT Pat_id FROM tbl_PatientDetails";
            txtpatid.setText("P"+generatedId.generateID(query));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlpatient1 = new javax.swing.JPanel();
        pnlpersonal = new javax.swing.JPanel();
        lblpname1 = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        lblpage1 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        lblgender = new javax.swing.JLabel();
        rdomale = new javax.swing.JRadioButton();
        rdofemale = new javax.swing.JRadioButton();
        lbladd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        lblcontact = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        lblpageval = new javax.swing.JLabel();
        lblpcontactval = new javax.swing.JLabel();
        lblpnameval = new javax.swing.JLabel();
        lblpatid = new javax.swing.JLabel();
        txtpatid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pnlmedhistory = new javax.swing.JPanel();
        lblcom = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtacomp = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtahistory = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtamedi = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtaallergy = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbosoft = new javax.swing.JComboBox();
        cbohard = new javax.swing.JComboBox();
        btnpsave = new javax.swing.JButton();
        btnpcancel = new javax.swing.JButton();
        btnpatback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD PATIENT");

        pnlpatient1.setBackground(new java.awt.Color(51, 153, 255));
        pnlpatient1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));

        pnlpersonal.setBackground(new java.awt.Color(153, 204, 255));
        pnlpersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true), "PERSONAL DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        lblpname1.setFont(new java.awt.Font("Arial", 1, 18));
        lblpname1.setForeground(new java.awt.Color(51, 51, 255));
        lblpname1.setText("NAME :");

        txtpname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpnameFocusLost(evt);
            }
        });
        txtpname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpnameKeyTyped(evt);
            }
        });

        lblpage1.setFont(new java.awt.Font("Arial", 1, 18));
        lblpage1.setForeground(new java.awt.Color(51, 51, 255));
        lblpage1.setText("AGE :");

        txtage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtageFocusLost(evt);
            }
        });
        txtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtageKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtageKeyTyped(evt);
            }
        });

        lblgender.setFont(new java.awt.Font("Arial", 1, 18));
        lblgender.setForeground(new java.awt.Color(51, 51, 255));
        lblgender.setText("GENDER :");

        rdomale.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rdomale);
        rdomale.setFont(new java.awt.Font("Arial", 1, 18));
        rdomale.setForeground(new java.awt.Color(51, 51, 255));
        rdomale.setText("MALE");

        rdofemale.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rdofemale);
        rdofemale.setFont(new java.awt.Font("Arial", 1, 18));
        rdofemale.setForeground(new java.awt.Color(51, 51, 255));
        rdofemale.setText("FEMALE");

        lbladd.setFont(new java.awt.Font("Arial", 1, 18));
        lbladd.setForeground(new java.awt.Color(51, 51, 255));
        lbladd.setText("ADDRESS :");

        txtadd.setColumns(20);
        txtadd.setRows(5);
        txtadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaddFocusLost(evt);
            }
        });
        txtadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaddKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtadd);

        lblcontact.setFont(new java.awt.Font("Arial", 1, 18));
        lblcontact.setForeground(new java.awt.Color(51, 51, 255));
        lblcontact.setText("CONTACT NO. :");

        txtcontact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcontactFocusLost(evt);
            }
        });
        txtcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontactKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontactKeyTyped(evt);
            }
        });

        lblpatid.setFont(new java.awt.Font("Arial", 1, 18));
        lblpatid.setForeground(new java.awt.Color(51, 51, 255));
        lblpatid.setText("PATIENT ID :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("(mobile number)");

        javax.swing.GroupLayout pnlpersonalLayout = new javax.swing.GroupLayout(pnlpersonal);
        pnlpersonal.setLayout(pnlpersonalLayout);
        pnlpersonalLayout.setHorizontalGroup(
            pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpersonalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(pnlpersonalLayout.createSequentialGroup()
                        .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbladd)
                            .addComponent(lblgender)
                            .addComponent(lblpname1)
                            .addComponent(lblpatid)
                            .addComponent(lblpage1)
                            .addComponent(lblcontact))
                        .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlpersonalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlpersonalLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblpnameval)
                                            .addComponent(lblpcontactval)
                                            .addComponent(lblpageval)))
                                    .addGroup(pnlpersonalLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtpname, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtpatid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                                .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(rdofemale)
                                            .addComponent(rdomale)))))
                            .addGroup(pnlpersonalLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlpersonalLayout.setVerticalGroup(
            pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpersonalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpatid)
                    .addComponent(txtpatid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpname1)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpersonalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblpnameval)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpage1)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblpageval)
                        .addGap(80, 80, 80)
                        .addComponent(rdofemale)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpersonalLayout.createSequentialGroup()
                        .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblgender)
                            .addComponent(rdomale))
                        .addGap(65, 65, 65)))
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbladd)
                    .addGroup(pnlpersonalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontact)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpcontactval)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        pnlmedhistory.setBackground(new java.awt.Color(153, 204, 255));
        pnlmedhistory.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true), "MEDICAL-HISTORY DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        lblcom.setFont(new java.awt.Font("Arial", 1, 18));
        lblcom.setForeground(new java.awt.Color(51, 51, 255));
        lblcom.setText("CHIEF COMPLAINT :");

        txtacomp.setColumns(20);
        txtacomp.setRows(5);
        txtacomp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtacompFocusLost(evt);
            }
        });
        txtacomp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtacompKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtacomp);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("PAST MEDICAL HISTORY :");

        txtahistory.setColumns(20);
        txtahistory.setRows(5);
        txtahistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtahistoryKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(txtahistory);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("MEDICATION :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("HISTORY OF ALLERGY :");

        txtamedi.setColumns(20);
        txtamedi.setRows(5);
        jScrollPane4.setViewportView(txtamedi);

        txtaallergy.setColumns(20);
        txtaallergy.setRows(5);
        jScrollPane5.setViewportView(txtaallergy);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("SOFT TISSUE :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("HARD TISSUE :");

        cbosoft.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gums", "Lips", "Tongue", " " }));

        cbohard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Teeth", "Jaws", " " }));

        javax.swing.GroupLayout pnlmedhistoryLayout = new javax.swing.GroupLayout(pnlmedhistory);
        pnlmedhistory.setLayout(pnlmedhistoryLayout);
        pnlmedhistoryLayout.setHorizontalGroup(
            pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmedhistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcom)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(pnlmedhistoryLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbosoft, javax.swing.GroupLayout.Alignment.LEADING, 0, 166, Short.MAX_VALUE))
                    .addComponent(cbohard, 0, 166, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlmedhistoryLayout.setVerticalGroup(
            pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmedhistoryLayout.createSequentialGroup()
                .addGroup(pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmedhistoryLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblcom))
                    .addGroup(pnlmedhistoryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmedhistoryLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1))
                    .addGroup(pnlmedhistoryLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmedhistoryLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(pnlmedhistoryLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmedhistoryLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(80, 80, 80)
                        .addGroup(pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbosoft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlmedhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbohard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26))
        );

        btnpsave.setBackground(new java.awt.Color(153, 204, 255));
        btnpsave.setFont(new java.awt.Font("Arial", 1, 24));
        btnpsave.setForeground(new java.awt.Color(51, 51, 255));
        btnpsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddPatient.JPG"))); // NOI18N
        btnpsave.setText("SAVE");
        btnpsave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnpsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpsaveActionPerformed(evt);
            }
        });

        btnpcancel.setBackground(new java.awt.Color(153, 204, 255));
        btnpcancel.setFont(new java.awt.Font("Arial", 1, 24));
        btnpcancel.setForeground(new java.awt.Color(51, 51, 255));
        btnpcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CancelPat.JPG"))); // NOI18N
        btnpcancel.setText("CANCEL");
        btnpcancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnpcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpcancelActionPerformed(evt);
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

        javax.swing.GroupLayout pnlpatient1Layout = new javax.swing.GroupLayout(pnlpatient1);
        pnlpatient1.setLayout(pnlpatient1Layout);
        pnlpatient1Layout.setHorizontalGroup(
            pnlpatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpatient1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnpsave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(btnpcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(btnpatback, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(497, 497, 497))
            .addGroup(pnlpatient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlmedhistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
        );
        pnlpatient1Layout.setVerticalGroup(
            pnlpatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpatient1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pnlpatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlmedhistory, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlpatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlpatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnpcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnpatback))
                    .addComponent(btnpsave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlpatient1, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlpatient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpatbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatbackActionPerformed

        
        homepage hp=new homepage();
    hp.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_btnpatbackActionPerformed

    private void txtpnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpnameKeyTyped
        try
        {
            char ch =evt.getKeyChar();
            if(ch>='0' & ch<='9')
            {
                evt.consume();
                txtpname.setText("");
                lblpnameval.setVisible(true);
                lblpnameval.setText("Enter Alphabets Only");
            }
            else
            {
                lblpnameval.setVisible(false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtpnameKeyTyped

    private void txtageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyTyped
         try
        {
            char ch =evt.getKeyChar();
            if(!(Character.isDigit(ch)))
            {
                evt.consume();
                txtage.setText("");
                lblpageval.setVisible(true);
                lblpageval.setText("Enter Digits Only");
            }
            else
            {
                lblpageval.setVisible(false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtageKeyTyped

    private void txtcontactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactKeyTyped
         try
        {
            char ch =evt.getKeyChar();
            if(!(Character.isDigit(ch)))
            {
                evt.consume();
                txtcontact.setText("");
                lblpcontactval.setVisible(true);
                lblpcontactval.setText("Enter Digits Only");
            }
            else
            {
                lblpcontactval.setVisible(false);
            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
          char c=evt.getKeyChar();
        if(!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE))) {
            getToolkit().beep();
            evt.consume();
            lblpcontactval.setVisible(true);
        } else{
            lblpcontactval.setVisible(false);
        }
    }//GEN-LAST:event_txtcontactKeyTyped

    private void btnpcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpcancelActionPerformed
        clear();
    }//GEN-LAST:event_btnpcancelActionPerformed

    private void btnpsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpsaveActionPerformed
        String rdGender="";
           if(rdomale.isSelected())
                 {
                        rdGender="Male";
                 }
            else if(rdofemale.isSelected())
                {
                        rdGender="Female";
                 }
            

         String soft="";
         String hard="";
         if(cbosoft.getSelectedItem().equals("Gums"))
                {
                    soft="gums";
                }
                 if(cbosoft.getSelectedItem().equals("Lips"))
                {
                    soft="lips";
                }
                 if(cbosoft.getSelectedItem().equals("Tongue"))
                {
                    soft="tongue";
                }

                if(cbohard.getSelectedItem().equals("Teeth"))
                {
                    hard="teeth";
                }
                 if(cbohard.getSelectedItem().equals("Jaw"))
                {
                    hard="jaw";
                }
          if (txtpname.getText().isEmpty() || txtage.getText().isEmpty() || txtadd.getText().isEmpty() || txtcontact.getText().isEmpty() ||txtacomp.getText().isEmpty() || txtamedi.getText().isEmpty() || txtamedi.getText().isEmpty() || txtahistory.getText().isEmpty() || rdGender.isEmpty() || cbosoft.getSelectedItem().equals("") || cbohard.getSelectedItem().equals(""))
           {
           JOptionPane.showMessageDialog(this,"Pls,Enter All Required Inputs","ErrorDialog",JOptionPane.ERROR_MESSAGE);

       }
 else
       {
        try{
           
           mPatient mp=new mPatient(txtpatid.getText(),txtpname.getText(),txtadd.getText(),Integer.parseInt(txtage.getText()),rdGender,txtcontact.getText(),txtacomp.getText(),txtahistory.getText(),txtamedi.getText(),txtaallergy.getText(),soft,hard);
           Controller.Addtodatabase(mp,"addPatientDetails");
           clear();
 txtpatid.setText("P" + generatedId.generateID(query));

      }    catch(Exception e){}
    }//GEN-LAST:event_btnpsaveActionPerformed
    }
    private void txtcontactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactKeyReleased
                 if(txtcontact.getText().length()>=11)
    {
            JOptionPane.showMessageDialog(null, "Invalid Mobile number", "Error", JOptionPane.ERROR_MESSAGE );
            txtcontact.setText("");

    }
                 
    }//GEN-LAST:event_txtcontactKeyReleased

    private void txtaddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaddKeyReleased
       if(txtadd.getText().length() > 60)
            {
                    JOptionPane.showMessageDialog(this,"Length of Address shudnt b greater than 60!!");
                   txtadd.setText("");
            }
        
    }//GEN-LAST:event_txtaddKeyReleased

    private void txtpnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpnameKeyReleased
       
    }//GEN-LAST:event_txtpnameKeyReleased

    private void txtageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyReleased
        
    }//GEN-LAST:event_txtageKeyReleased

    private void txtacompKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtacompKeyReleased
         
    }//GEN-LAST:event_txtacompKeyReleased

    private void txtahistoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtahistoryKeyReleased
        
    }//GEN-LAST:event_txtahistoryKeyReleased

    private void txtpnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpnameFocusLost
        
    }//GEN-LAST:event_txtpnameFocusLost

    private void txtageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtageFocusLost
      
    }//GEN-LAST:event_txtageFocusLost

    private void txtaddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddFocusLost
       
    }//GEN-LAST:event_txtaddFocusLost

    private void txtcontactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontactFocusLost
        
    }//GEN-LAST:event_txtcontactFocusLost

    private void txtacompFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtacompFocusLost
       
    }//GEN-LAST:event_txtacompFocusLost
    public void clear()
        {        
        txtpatid.setText("");
        txtpname.setText("");
        txtage.setText("");
        txtadd.setText("");
        txtcontact.setText("");
        txtamedi.setText("");
        txtaallergy.setText("");
        txtacomp.setText("");
        txtahistory.setText("");
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpatback;
    private javax.swing.JButton btnpcancel;
    private javax.swing.JButton btnpsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbohard;
    private javax.swing.JComboBox cbosoft;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel lblcom;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblpage1;
    private javax.swing.JLabel lblpageval;
    private javax.swing.JLabel lblpatid;
    private javax.swing.JLabel lblpcontactval;
    private javax.swing.JLabel lblpname1;
    private javax.swing.JLabel lblpnameval;
    private javax.swing.JPanel pnlmedhistory;
    private javax.swing.JPanel pnlpatient1;
    private javax.swing.JPanel pnlpersonal;
    private javax.swing.JRadioButton rdofemale;
    private javax.swing.JRadioButton rdomale;
    private javax.swing.JTextArea txtaallergy;
    private javax.swing.JTextArea txtacomp;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextArea txtahistory;
    private javax.swing.JTextArea txtamedi;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtpatid;
    private javax.swing.JTextField txtpname;
    // End of variables declaration//GEN-END:variables
}
