/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.mAppointment;
import Model.mPatient;
import Model.mPayment;
import Model.mTreatment;
import java.sql.SQLException;


/**
 *
 * @author abc
 */
public class Controller {
     public static void Addtodatabase(Object data, String flag) throws ClassNotFoundException, SQLException
    {
        if(flag.equals("addAppointment"))
        {
            mAppointment ma=(mAppointment)data;
            mAppointment.addAppointment(ma);
        }

        if(flag.equals("addPatientDetails"))
        {
            mPatient mp=(mPatient)data;
            mPatient.addPatientDetails(mp);
        }

        if(flag.equals("addTreatment"))
        {
            mTreatment mt=(mTreatment)data;
            mTreatment.addNewTreatment(mt);
        }
        
        if(flag.equals("addPayment"))
        {
            mPayment mP=(mPayment)data;
            mPayment.addPayment(mP);
        }
    }
     public static void UpdateINdatabase(Object data,String flag)throws ClassNotFoundException,SQLException
    {
         if(flag.equals("updateAppointment"))
        {
            mAppointment ma=(mAppointment)data;
            mAppointment.updateAppointment(ma);
        }
          if(flag.equals("updatePatientDetails"))
        {
            mPatient ma=(mPatient)data;
            mPatient.updatePatientDetails(ma);
        }

         if(flag.equals("updateTreatment"))
        {
            mTreatment ma=(mTreatment)data;
            mTreatment.updateTreatment(ma);
        }

        if(flag.equals("updatePayment"))
        {
            mPayment ma=(mPayment)data;
            mPayment.UpdatePayment(ma);
        }
    }

    public static void removeFromdatabase(String flag,String Id)throws ClassNotFoundException,SQLException
    {
         if(flag.equals("deleteAppointment"))
        {

            mAppointment.deleteAppointment(Id);
        }
    }

}
