package Listners;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class Student_listener implements ServletContextListener {

	Connection con;
    public Student_listener() {
        
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
        try {con.close();}
        catch(Exception e) {e.printStackTrace();}
    }

    public void contextInitialized(ServletContextEvent sce)  { 
         String DriverClass=sce.getServletContext().getInitParameter("driverclass");
         String jdbcurl=sce.getServletContext().getInitParameter("jdbcurl");
         String user=sce.getServletContext().getInitParameter("user");
         String password=sce.getServletContext().getInitParameter("password");
    
         try 
         {
        	 Class.forName(DriverClass);
        	 con=DriverManager.getConnection(jdbcurl, user, password);
        	 sce.getServletContext().setAttribute("MyConnection", con);
        	 System.out.println("Connection has been establised");         }
         catch(Exception e)
         {
        	 e.printStackTrace();
         }
    
    }
	
}
