package oracle.forms.fd;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.StringTokenizer;

import javax.swing.JFrame;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import oracle.forms.ui.VBean;
import oracle.forms.handler.IHandler;
import oracle.forms.properties.ID;
import oracle.forms.ui.CustomEvent;

//import javax.swing.UIManager;
//import oracle.bali.ewt.olaf.OracleLookAndFeel;


  /**
   * A javabean that displays a Swing Calendar
   * inside or outside the Forms frame
   *
   * @author Francois Degrelle (Bean wraper)
   * 
   * @author Kai Toedter (calendar bean)
   * (C)1998-2002 Kai Toedter
   * Released under GNU Lesser General Public License (see license.html)
   * kai@toedter.com
   * www.toedter.com
   * 
   */

public class JCalendar extends VBean implements PropertyChangeListener
{
  public final static ID SHOW                  = ID.registerProperty("SHOW_CALENDAR");  
  public final static ID GETDATE               = ID.registerProperty("GET_DATE");   
  public final static ID SETPROPERTY           = ID.registerProperty("SET_PROPERTY");    
  public final static ID CALENDAR_EVENT        = ID.registerProperty("CALENDAR_EVENT");    
  public final static ID CALENDAR_EVENT_DATE   = ID.registerProperty("CALENDAR_EVENT_DATE");    
  public final static ID CALENDAR_EVENT_DAY    = ID.registerProperty("CALENDAR_EVENT_DAY");    
  public final static ID CALENDAR_EVENT_MONTH  = ID.registerProperty("CALENDAR_EVENT_MONTH");    
  public final static ID CALENDAR_EVENT_YEAR   = ID.registerProperty("CALENDAR_EVENT_YEAR");    
    
  private com.toedter.calendar.JCalendar jc ;
  private boolean bLog = false ;
  private JFrame         frame = new JFrame("Calendrier");
  private Calendar       calendar;
  private WindowListener wl;
  private MouseListener  ml ;
  private IHandler       m_handler; 
  private int            iDay, iMonth,iYear ;
  private String         sDate = "" ;
  private int            iX=0, iY=0;
  private Locale         locale = Locale.getDefault();
  
  public JCalendar()
  {
    wl = new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
          frame.setVisible(false);
				}
			};    
    setMouseListener() ;
      //
      //  uncomment the following lines to
      //  use the Oracle Look and Feel
      //  (must add the share.jar and jewt4.jar files to the archive/archive_jini tags)
      /*
      try{
         // use the Oracle Look and Feel
         UIManager.setLookAndFeel(new OracleLookAndFeel());
      }
      catch(Exception e) {e.printStackTrace();}        
      */    
      // Install the Plastic L&F
      initializeLookAndFeels();
  }
  
  public void init(IHandler handler)
  {
      m_handler = handler;
      super.init(handler);
      setMouseListener() ;
      frame.addWindowListener(wl);    
      jc = new com.toedter.calendar.JCalendar();
      jc.addPropertyChangeListener(this);  
      calendar = Calendar.getInstance();
      jc.setCalendar(calendar);  
      com.toedter.calendar.JDayChooser dc = jc.getDayChooser() ;
      Component[] cps = dc.getComponents() ;
      javax.swing.JButton jb ;
      for(int i = 0; i < cps.length; i++)
      {
        if(cps[i] instanceof javax.swing.JPanel)
        {
          javax.swing.JPanel jp = (javax.swing.JPanel)cps[i] ;
          Component[] cps2 = jp.getComponents() ;
          for(int j=0; j< cps2.length; j++)
          {
            try
            {
              cps2[j].addMouseListener(ml);
            } catch(Exception e){;}
          }
        }          
      }
      frame.getContentPane().add(jc);
      frame.pack();        
  }     
  
   
  /*-----------------------------------*
   *  All the properties you can set
   *-----------------------------------*/
  public boolean setProperty(ID property, Object value)
  {
    log(property+":"+value);
    
    //
    // set the header
    //
    if (property == SHOW) 
    {
      String sValue = value.toString();
      int ix=0, iy=0 ;
      if(sValue != null)
      {
        int x = sValue.indexOf(",");
        // coordinates given ?
        if(x != -1)
        {
          try
          { 
            ix = Integer.parseInt(sValue.substring(0,x));
            iy = Integer.parseInt(sValue.substring(x+1,sValue.length()));
            iX = (int)this.getLocationOnScreen().getX() ;
            iY = (int)this.getLocationOnScreen().getY() ;
            log("x:"+ix+" y:"+iy);
            if(iy > 0 && ix > 0) frame.setLocation(ix+iX,iy+iY);
          } catch(Exception e) {;}
        }
      }
      frame.setVisible(true);
      return true ;
    }
    //
    // set some JCalendar properties
    //
    else if(property == SETPROPERTY)
    { 
      String s = value.toString();
      String sProp="";
      String s1=null, s2=null, s3=null,s4=null ;
      Color c;
      StringTokenizer st ;
      st = new StringTokenizer(s,",");
      // property
      if(st.hasMoreTokens()) sProp = st.nextToken() ; else return false ;
      // property values
      if(st.hasMoreTokens()) s1 = st.nextToken() ; else return false ;
      if(st.hasMoreTokens()) s2 = st.nextToken() ;
      if(st.hasMoreTokens()) s3 = st.nextToken() ;
      if(sProp.equalsIgnoreCase("title")) {
          frame.setTitle(s1);
      }
      else if(sProp.equalsIgnoreCase("background")) {
          c = makeColor(s1) ;
          if(c != null) jc.setBackground(c);
      }
      else if(sProp.equalsIgnoreCase("foreground")) {
          c = makeColor(s1) ;
          if(c != null) jc.setForeground(c);
      }      
      else if(sProp.equalsIgnoreCase("decorationforeground")) {
          c = makeColor(s1) ;
          if(c != null) jc.setDecorationBackgroundColor(c);;
      }      
      else if(sProp.equalsIgnoreCase("sundayforeground")) {
          c = makeColor(s1) ;
          if(c != null) jc.setSundayForeground(c);
      }      
      else if(sProp.equalsIgnoreCase("weekdayforeground")) {
          c = makeColor(s1) ;
          if(c != null) jc.setWeekdayForeground(c);
      }            
      else if(sProp.equalsIgnoreCase("locale")) {
          locale = new Locale(value.toString());
          Locale.setDefault(locale);
          jc.setLocale(locale);
      }                  
      else if(sProp.equalsIgnoreCase("log")) {
        if(value.toString().equalsIgnoreCase("true")) bLog = true ;
        else bLog = false;
        return true ;
      }
      return true ;
    }
    else
    {
     return super.setProperty(property, value);
    }    
  }  

   /*-----------------------*
    *  Get the properties
    *-----------------------*/
    public Object getProperty(ID pId) // Get the current cell value
    {
      
      //
      // get the current cell value
      //
      if (pId == GETDATE)
      {
        return "" + sDate ;
      }

      else
      {
        return super.getProperty(pId);
      }
    } 

    
    /*----------------------------------------*
     *  Make a color from a RGB string
     *  Color c = makeColor( "r128g25b100" ); 
     *----------------------------------------*/
    Color makeColor(String s)
    {
      int r=-1, g=-1, b=-1 ;
      int iR=255, iG=255, iB=255 ;
      Color c = Color.white ;
      r = s.indexOf("r") ;
      g = s.indexOf("g") ;
      b = s.indexOf("b") ;
      if( r>-1 && g>-1 && b>-1 )
      {
        iR = Integer.parseInt(s.substring(r+1,g)) ;
        iG = Integer.parseInt(s.substring(g+1,b)) ;
        iB = Integer.parseInt(s.substring(b+1)) ;
        try
        {
          c = new Color(iR,iG,iB) ;
        }
        catch( Exception e) { return null;} ;
      }
      return c ;
    } 
   
   /*-----------------------------------------*
    *   create a MouseListener for the table
    *-----------------------------------------*/
   void setMouseListener()
   {
         ml = new MouseListener(){
          public void mouseClicked (MouseEvent me) {}
          public void mouseEntered (MouseEvent me) {}
          public void mousePressed (MouseEvent me) 
          {
           int iBut = me.getButton() ;
           if(me.getClickCount() > 1)
           {
              // send selected date to Forms
              SendMessage( sDate, iDay, iMonth, iYear ) ;
           }
          }
          public void mouseReleased (MouseEvent me) {} 
          public void mouseExited (MouseEvent me) {} 
        };     
   } 
  
    
  /*-------------------------------
   *  send message back to Forms
   *------------------------------*/
  public void SendMessage(String p_date, int p_day, int p_month, int p_year )
  {
    try{
      CustomEvent ce = new CustomEvent(m_handler, CALENDAR_EVENT);
      m_handler.setProperty( CALENDAR_EVENT_DATE, p_date );
      m_handler.setProperty( CALENDAR_EVENT_DAY,   "" + p_day );
      m_handler.setProperty( CALENDAR_EVENT_MONTH, "" + p_month );
      m_handler.setProperty( CALENDAR_EVENT_YEAR,  "" + p_year );
      dispatchCustomEvent(ce);  
      if(frame != null) frame.setVisible(false);
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
      //e.printStackTrace();
    }
  }

  public void propertyChange(PropertyChangeEvent evt) {
     if (frame != null) {
	System.out.println("propertyChange:"+evt.getPropertyName());
        if (evt.getPropertyName().equals("locale")) {
           jc.setLocale((Locale) evt.getNewValue());
	   DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,jc.getLocale());
	} else if (evt.getPropertyName().equals("calendar")) {
            calendar = (Calendar) evt.getNewValue();
            DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,jc.getLocale());
            sDate = df.format(calendar.getTime()) ;
            iDay = jc.getDayChooser().getDay();
            iMonth = jc.getMonthChooser().getMonth() + 1;
            iYear = jc.getYearChooser().getYear();
            log("Selected date:"+sDate);
            jc.setCalendar(calendar);
	}
     }
  }  

  void log(String sMessage)
  {
    if(bLog) System.out.println(sMessage);
  }

    /**
     * Installs the JGoodies Look & Feels, if available, in classpath.
     */
    public final void initializeLookAndFeels() {
            // if in classpath thry to load JGoodies Plastic Look & Feel
            try {
                    LookAndFeelInfo[] lnfs = UIManager.getInstalledLookAndFeels();
                    boolean found = false;
                    for (int i = 0; i < lnfs.length; i++) {
                            if (lnfs[i].getName().equals("JGoodies Plastic 3D")) {
                                    found = true;
                            }
                    }
                    if (!found) {
                            UIManager.installLookAndFeel("JGoodies Plastic 3D",
                                            "com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
                    }
                    UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
            } catch (Throwable t) {
                    try {
                            System.out.println("Set System L&F");
                            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    } catch (Exception e) {
                            e.printStackTrace();
                    }
            }
    }

}