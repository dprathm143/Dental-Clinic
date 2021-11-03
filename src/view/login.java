package view;

import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame 
{
    private static int count;
    /** Creates new form login */
    public login() {
        initComponents();
        count=0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnllogin = new javax.swing.JPanel();
        lbllogin = new javax.swing.JLabel();
        lbluname = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblwel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN FORM");
        setBackground(new java.awt.Color(102, 153, 255));

        pnllogin.setBackground(new java.awt.Color(0, 0, 0));
        pnllogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));

        lbllogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/happy-tooth2.jpg"))); // NOI18N
        lbllogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));

        lbluname.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbluname.setForeground(new java.awt.Color(51, 51, 255));
        lbluname.setText("USERNAME :");

        lblpass.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblpass.setForeground(new java.awt.Color(51, 51, 255));
        lblpass.setText("PASSWORD :");

        btnlogin.setBackground(new java.awt.Color(153, 204, 255));
        btnlogin.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 0, 0));
        btnlogin.setText("LOGIN");
        btnlogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnclose.setBackground(new java.awt.Color(153, 204, 255));
        btnclose.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 0, 0));
        btnclose.setText("CLOSE");
        btnclose.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Dr.Aamir's");

        lblwel.setFont(new java.awt.Font("Bodoni MT Black", 3, 36)); // NOI18N
        lblwel.setForeground(new java.awt.Color(51, 255, 0));
        lblwel.setText("Dental Hub");

        javax.swing.GroupLayout pnlloginLayout = new javax.swing.GroupLayout(pnllogin);
        pnllogin.setLayout(pnlloginLayout);
        pnlloginLayout.setHorizontalGroup(
            pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlloginLayout.createSequentialGroup()
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlloginLayout.createSequentialGroup()
                        .addComponent(lbllogin, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlloginLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlloginLayout.createSequentialGroup()
                                        .addComponent(lblpass)
                                        .addGap(21, 21, 21))
                                    .addGroup(pnlloginLayout.createSequentialGroup()
                                        .addComponent(lbluname)
                                        .addGap(18, 18, 18)))
                                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtpass)
                                    .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
                            .addGroup(pnlloginLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1))
                            .addGroup(pnlloginLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(lblwel))))
                    .addGroup(pnlloginLayout.createSequentialGroup()
                        .addGap(521, 521, 521)
                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        pnlloginLayout.setVerticalGroup(
            pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlloginLayout.createSequentialGroup()
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllogin)
                    .addGroup(pnlloginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(lblwel)
                        .addGap(64, 64, 64)
                        .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbluname)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlloginLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(lblpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(102, 102, 102))
                            .addGroup(pnlloginLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(9, 9, 9)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(217, 217, 217))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnllogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pnllogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        if(count<3)
        {
        if(txtuser.getText().equals("admin")&&txtpass.getText().equals("admin"))
        {
            homepage hp=new homepage();
            hp.setVisible(true);
            this.dispose();
        }
        else if(txtuser.getText().equals("")&&txtpass.getText().equals(""))
        {
            count++;
            JOptionPane.showMessageDialog(null,"User Name OR Password cannot be empty!","Error",JOptionPane.ERROR_MESSAGE);
            txtuser.setText("");
            txtpass.setText("");
        }
        else
        {
            count++;
            JOptionPane.showMessageDialog(null,"Please enter correct User Name and Password!","Error",JOptionPane.ERROR_MESSAGE);
            txtuser.setText("");
            txtpass.setText("");
         }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry your chance is over!", "Error", JOptionPane.ERROR_MESSAGE );
            System.exit(0);
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        System.exit(0);

    }//GEN-LAST:event_btncloseActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbluname;
    private javax.swing.JLabel lblwel;
    private javax.swing.JPanel pnllogin;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
