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
public class mPatient {
private static String strcbo;
private static JComboBox cbo;
private static String strrdo;
private static JRadioButton rdo;
private String Pat_id;
private String Pat_name;
private String Address;
private int Age;
private String Gender;
private String Contact;
private String Complaint;
private String Medical_history;
private String Medication;
private String History_allergy;
private String Softtissue;
private String Hardtissue;

public mPatient()
{}
public mPatient(String Pat_id,String Pat_name,String Address,int Age,String Gender,String Contact,String Complaint,String Medical_history,String Medication,String History_allergy,String Softtissue,String Hardtissue)
{
    this.Pat_id=Pat_id;
    this.Pat_name=Pat_name;
    this.Address=Address;
    this.Age=Age;
    this.Gender=Gender;
    this.Contact=Contact;
    this.Complaint=Complaint;
    this.Medical_history=Medical_history;
    this.Medication=Medication;
    this.History_allergy=History_allergy;
    this.Softtissue=Softtissue;
    this.Hardtissue=Hardtissue;

}
public mPatient(String Pat_id,String Pat_name,String Address,int Age,String Contact,String Complaint,String Medical_history,String Medication,String History_allergy,String Softtissue,String Hardtissue)
{
    this.Pat_id=Pat_id;
    this.Pat_name=Pat_name;
    this.Address=Address;
    this.Age=Age;
    this.Contact=Contact;
    this.Complaint=Complaint;
    this.Medical_history=Medical_history;
    this.Medication=Medication;
    this.History_allergy=History_allergy;
    this.Softtissue=Softtissue;
    this.Hardtissue=Hardtissue;

}
public mPatient(JComboBox cbo,JRadioButton rdo)
   {
        this.cbo=cbo;
        this.rdo=rdo;
   }
public mPatient(JComboBox cbo)
{
        this.cbo=cbo;
}
public static void addPatientDetails(mPatient mp)throws ClassNotFoundException,SQLException
{
    try{
            Connection dbCon = DbConnection.getConnection();
      PreparedStatement st = dbCon.prepareStatement("Insert into tbl_PatientDetails values (?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1,mp.Pat_id);
            st.setString(2,mp.Pat_name);
            st.setString(3,mp.Address);
            st.setInt(4,mp.Age);
            st.setString(5,mp.Gender);
            st.setString(6,mp.Contact);
            st.setString(7,mp.Complaint);
            st.setString(8,mp.Medical_history);
            st.setString(9,mp.Medication);
            st.setString(10,mp.History_allergy);
            st.setString(11,mp.Softtissue);
            st.setString(12,mp.Hardtissue);
            st.execute();
  
            st.close();
            
            dbCon.close();
            JOptionPane.showMessageDialog(null, "Patient Details Saved Successfully!!!");
        }catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Patient id already assigned!!!");
        }
}
public static void updatePatientDetails(mPatient mpt)throws ClassNotFoundException, SQLException
    {
        System.out.println("In Model");
        strrdo=rdo.getText();
        strcbo=cbo.getSelectedItem().toString();
        Connection dbConnection = DbConnection.getConnection();
        String query ="update tbl_PatientDetails set Address=?,Age=?,Contact=?,Complaint=?,Medical_history=?,Medication=?,History_allergy=?,Softtissue=?,Hardtissue=? where "+strrdo+" = '"+strcbo+"'";
        PreparedStatement strSQL = dbConnection.prepareStatement(query);
        strSQL.setString(1, mpt.Address);
        strSQL.setInt(2, mpt.Age);
        strSQL.setString(3,mpt.Contact);
        strSQL.setString(4,mpt.Complaint);
        strSQL.setString(5,mpt.Medical_history);
        strSQL.setString(6,mpt.Medication);
        strSQL.setString(7,mpt.History_allergy);
        strSQL.setString(8,mpt.Softtissue);
        strSQL.setString(9,mpt.Hardtissue);
        //strSQL.setString(6,mpt.Pat_id1 );
        strSQL.executeUpdate();
        dbConnection.close();
        JOptionPane.showMessageDialog(null, "Patient Details Updated Successfully!!!");
    }

   
   

   
public String getPatid()
 {
    return Pat_id;
 }

 public String getPatname()
 {
    return Pat_name;
 }

 public String getAddres()
 {
    return Address;
 }

  public int getAge()
 {
    return Age;
 }

  public String getGender()
 {
    return Gender;
 }

 public String getContact()
 {
    return Contact;
 }

  public String getComplaint()
 {
    return Complaint;
 }

 public String getMedicalhistory()
 {
    return Medical_history;
 }

 public String getMedication()
 {
    return Medication;
 }

 public String getHistoryallergy()
 {
    return History_allergy;
 }

 public String getSofttissue()
 {
    return Softtissue;
 }

 public String getHardtissue()
 {
    return Hardtissue;
 }


}
