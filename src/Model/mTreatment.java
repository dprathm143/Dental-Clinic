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


/**
 *
 * @author abc
 */
public class mTreatment {
private static String strcbo;
    private static JComboBox cbo;
    private static String strrdo;
    private static JRadioButton rdo;
    private String Pat_id;
    private static String Pat_name;
    private String T_id;
    private String T_name;
    private int T_cost;

    public mTreatment()
    {}
/*    public mTreatment(String Pat_id,String Pat_name,String Treat_id,String Treat_name,int Treat_cost)

    {
        this.Pat_id=Pat_id;
        this.Pat_name=Pat_name;
        this.Treat_id=Treat_id;

        this.Treat_name=Treat_name;
        this.Treat_cost=Treat_cost;
    }*/
    public mTreatment(String Pat_id,String Pat_name,String T_id,String T_name,int T_cost)

    {
        this.Pat_id=Pat_id;
        this.Pat_name=Pat_name;
        this.T_id=T_id;

        this.T_name=T_name;
        this.T_cost=T_cost;
    }
    public mTreatment(JComboBox cbo,JRadioButton rdo)
    {
        this.cbo=cbo;
        this.rdo=rdo;
    }
    public mTreatment(JComboBox cbo)
    {
        this.cbo=cbo;
       
    }
    public static void addNewTreatment(mTreatment mt) throws ClassNotFoundException,SQLException
    {
        try
        {
            Connection dbCon = DbConnection.getConnection();
            PreparedStatement st = dbCon.prepareStatement("Insert into tbl_Treatment Values(?,?,?,?,?)");
             st.setString(1,mt.Pat_id);
              st.setString(2,mt.Pat_name);
            st.setString(3,mt.T_id);
            st.setString(4,mt.T_name);
            st.setInt(5,mt.T_cost);
            st.execute();
            st.close();
            dbCon.close();
            JOptionPane.showMessageDialog(null, "Treatment  Saved Successfully!!!");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Treatment id already assigned!!!");
            e.printStackTrace();
        }
    }
     
    public static void updateTreatment(mTreatment mt)throws ClassNotFoundException, SQLException
    {
        System.out.println("In Model");
       // strrdo=rdo.getText();
        //strcbo=cbo.getSelectedItem().toString();
        Connection dbConnection = DbConnection.getConnection();
        String query ="update tbl_Treatment set T_name=?,T_cost=? where Pat_name='"+ Pat_name +"'";
        PreparedStatement strSQL = dbConnection.prepareStatement(query);
        strSQL.setString(1, mt.T_name);
        strSQL.setInt(2, mt.T_cost);
        strSQL.executeUpdate();
        dbConnection.close();
        JOptionPane.showMessageDialog(null, "Treatment Updated Successfully!!!");
    }
     public String getTid()
    {
        return T_id;
    }

    public String getTname()
    {
        return T_name;
    }
    public int getTcost()
    {
        return  T_cost;
    }
}
