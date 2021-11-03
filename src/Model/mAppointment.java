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
/**
 *
 * @author abc
 */
public class mAppointment {

    private static String strcbo;
    private static JComboBox cbo;
    private String App_id;
    private String Pat_name;
    private String  App_date;
    private String App_time;


    public mAppointment()
    {}
     public mAppointment(String App_id,String Pat_name,String App_date,String App_time)
    {
        this.App_id=App_id;

        this.Pat_name=Pat_name;
        this.App_date=App_date;
        this.App_time=App_time;

    }
 public mAppointment(String App_time)
    {

         this.App_time=App_time;
    }

    public mAppointment(String  App_date,String App_time)
    {
        this.App_date=App_date;
         this.App_time=App_time;
    }
   

     public mAppointment(JComboBox cbo)
   {
        this.cbo=cbo;
   }
    public static void addAppointment(mAppointment objApp) throws ClassNotFoundException, SQLException
    {
        try
        {
            Connection dbCon = DbConnection.getConnection();
            PreparedStatement st = dbCon.prepareStatement("Insert into tbl_Appointment Values(?,?,?,?)");
            st.setString(1,objApp.App_id);
            st.setString(2,objApp.Pat_name);
            st.setString(3,objApp.App_date);
            st.setString(4,objApp.App_time);
            st.execute();
            st.close();
            dbCon .close();
            JOptionPane.showMessageDialog(null, "Appointment Details Saved Successfully!!!");
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Appointment already filled!!!");
        }
    }
     public static void updateAppointment(mAppointment objApp)throws ClassNotFoundException, SQLException
        {
        try
        {
            Connection dbConnection = DbConnection.getConnection();
            strcbo=cbo.getSelectedItem().toString();
            String query ="update tbl_Appointment set App_date=?,App_time=? where App_id='"+strcbo+"'";
            PreparedStatement strSQL = dbConnection.prepareStatement(query);
            //strSQL.setString(1,objApp.App_id);
            //strSQL.setString(2,objApp.Pat_name);
            strSQL.setString(1,objApp.App_date);
            strSQL.setString(2,objApp.App_time);
            //strSQL.setString(2,objApp.Pat_id);
            strSQL.executeUpdate();
            dbConnection.close();
            JOptionPane.showMessageDialog(null, "Record updated successfully!!");
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Appointment already filled!!!");
        }
    }

      public static void deleteAppointment(String name)throws ClassNotFoundException,SQLException
     {
            Connection dbConnection=DbConnection.getConnection();
            String query ="DELETE FROM tbl_Appointment WHERE App_id='"+name+"'";
            PreparedStatement strSQL = dbConnection.prepareStatement(query);
            strSQL.executeUpdate();
            dbConnection.close();

     }
public String getAppid()
     {
         return App_id;
     }



     public String getPatname()
     {
         return Pat_name;
     }

     public String getAppdate()
     {
           return App_date;
     }
     public String getApptime()
     {
         return App_time;
     }
}
