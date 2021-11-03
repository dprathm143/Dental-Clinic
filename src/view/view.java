/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import DB.DbConnection;
import java.awt.Container;
import java.sql.*;
import java.util.HashMap;
import javax.swing.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author abc
 */
public class view extends JFrame
{
    public view(HashMap id)
    {
        Connection con;
            try
            {
                con = DbConnection.getConnection();
                JasperReport jasperReport = JasperCompileManager.compileReport("report1.jrxml");
                JasperPrint print= JasperFillManager.fillReport(jasperReport,id,con);
                JRViewer viewer=new JRViewer(print);
                Container c=this.getContentPane();
                c.add(viewer);
                this.setExtendedState(MAXIMIZED_BOTH);
                this.setVisible(true);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

    }

}
