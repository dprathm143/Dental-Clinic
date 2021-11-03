/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import DB.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 *
 * @author abc
 */
public class mPayment {
 private static String strcbo;
    private static JComboBox cbo;
    private static String strrdo;
    private static JRadioButton rdo;
    
    private String Pat_id;
    private String Pat_name;
    private String T_id;
    private int T_charge;
    private int Paid_amt;
    private int Balance_amt;


public  mPayment(){}

public mPayment(String Pat_id,String Pat_name,String T_id,int T_charge,int Paid_amt,int Balance_amt)
{
    this.Pat_id=Pat_id;
    this.Pat_name=Pat_name;
    this.T_id=T_id;
    this.T_charge=T_charge;
    this.Paid_amt=Paid_amt;
    this.Balance_amt=Balance_amt;
}
public mPayment(String Pat_id,String Pat_name,int Paid_amt,int Balance_amt)
{
    this.Pat_id=Pat_id;
    this.Pat_name=Pat_name;
    this.Paid_amt=Paid_amt;
    this.Balance_amt=Balance_amt;
}

public mPayment(JComboBox cbo,JRadioButton rdo)
   {
        this.cbo=cbo;
        this.rdo=rdo;
   }

public static void addPayment(mPayment objTrans) throws ClassNotFoundException, SQLException
    {
        try
        {
            Connection dbCon = DbConnection.getConnection();
            PreparedStatement st = dbCon.prepareStatement("Insert into tbl_Payment Values(?,?,?,?,?,?)");
            st.setString(1, objTrans.Pat_id);
            st.setString(2,objTrans.Pat_name);
            st.setString(3,objTrans.T_id);
            st.setInt(4,objTrans.T_charge);
            st.setInt(5,objTrans.Paid_amt);
            st.setInt(6,objTrans.Balance_amt);
            st.execute();
            st.close();
            dbCon .close();
            JOptionPane.showMessageDialog(null, "Payment Details Saved Successfully!!!");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }



public static void UpdatePayment(mPayment objTrans) throws ClassNotFoundException,SQLException
 {
        Connection con=DbConnection.getConnection();
        strrdo=rdo.getText();
        strcbo=cbo.getSelectedItem().toString();
        PreparedStatement ps=con.prepareStatement("update tbl_Payment set Paid_amt=?,Balance_amt=? where "+strrdo+" = '"+strcbo+"'");

             ps.setInt(1,objTrans.Paid_amt);
             ps.setInt(2,objTrans.Balance_amt);

        ps.executeUpdate();
        con.close();
        JOptionPane.showMessageDialog(null, "Payment Details Saved Successfully!!!");
 }
}
