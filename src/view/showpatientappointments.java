/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * searchpatient.java
 *
 * Created on Nov 23, 2011, 7:45:07 PM
 */

package view;
import DB.DbConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author abc
 */
public class showpatientappointments extends javax.swing.JFrame {
Connection con;
PreparedStatement pst;
Statement st;
ResultSet rs;
    /** Creates new form searchpatient */
    public showpatientappointments() {
        initComponents();
                
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlsearch = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnback = new javax.swing.JButton();
        btnshow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEARCH PATIENT");

        pnlsearch.setBackground(new java.awt.Color(51, 153, 255));
        pnlsearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(153, 204, 255));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        jTable1.setFont(new java.awt.Font("Arial", 1, 18));
        jTable1.setForeground(new java.awt.Color(51, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title1", "Title2", "Title3", "Title4"
            }
        ));
        jTable1.setAlignmentX(0.7F);
        jTable1.setAlignmentY(0.7F);
        jTable1.setEnabled(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(1, 3));
        jTable1.setRowHeight(19);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        btnback.setBackground(new java.awt.Color(153, 204, 255));
        btnback.setFont(new java.awt.Font("Arial", 1, 24));
        btnback.setForeground(new java.awt.Color(51, 51, 255));
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.gif"))); // NOI18N
        btnback.setText("BACK");
        btnback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnshow.setBackground(new java.awt.Color(153, 204, 255));
        btnshow.setFont(new java.awt.Font("Arial", 1, 24));
        btnshow.setForeground(new java.awt.Color(51, 51, 255));
        btnshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save3.jpg"))); // NOI18N
        btnshow.setText("SHOW ALL APPOINTMENTS");
        btnshow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnshow, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnshow, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlsearchLayout = new javax.swing.GroupLayout(pnlsearch);
        pnlsearch.setLayout(pnlsearchLayout);
        pnlsearchLayout.setHorizontalGroup(
            pnlsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsearchLayout.createSequentialGroup()
                .addGroup(pnlsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlsearchLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlsearchLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        pnlsearchLayout.setVerticalGroup(
            pnlsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsearchLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
         homepage hp=new homepage();
    hp.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
         try {
            String [] tblCol={"APPOINTMENT ID","PATIENT NAME","APPOINTMENT DATE","APPOINTMENT TIME"};
            DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
            dtm.setColumnIdentifiers(tblCol);
            dtm.setRowCount(0);
            try{
                  Connection con = DbConnection.getConnection();

                 Statement stmt=con.createStatement();
                 String sql= "select App_id,Pat_name,App_date,App_time from tbl_Appointment";
                 ResultSet res=stmt.executeQuery(sql);
               //JOptionPane.showMessageDialog(null,sql);
                 ResultSetMetaData rsmd=res.getMetaData();
                 int colNo=rsmd.getColumnCount();
                 while(res.next())
                 {
                   Object []objects=new Object[colNo];
                   for(int i=0;i<colNo;i++)
                   {
                      objects[i]=res.getObject(i+1);
                   }
                   dtm.addRow(objects);
                 }
                 jTable1.setModel(dtm);
              }
           catch(Exception e)
           {
              e.printStackTrace();
           }
        }
        catch (Exception ex) {
            Logger.getLogger(showallpatients.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }//GEN-LAST:event_btnshowActionPerformed

    /**
    * @param args the command line arguments
    */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnshow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlsearch;
    // End of variables declaration//GEN-END:variables

}
