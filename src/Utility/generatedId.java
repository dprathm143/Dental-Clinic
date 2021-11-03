/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Utility;
import DB.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Sudhakaran
 */
public class generatedId {
 public static int generateID(String query)
    {
        Statement st;
        Connection con;
        ResultSet rs;
        int id;
        int max=0;
        try
        {
            con = DbConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next())
            {
                id = Integer.parseInt(rs.getString(1).substring(1));
                if(id>max)
                {
                    max=id;
                }
            }
        } catch(Exception e)
        {
            System.out.println(e.toString());
        }
        max=max+1;
        return max;


}
}
