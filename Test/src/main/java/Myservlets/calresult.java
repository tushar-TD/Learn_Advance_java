package Myservlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/calresult")
public class calresult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;

	public void init(ServletConfig config) throws ServletException {
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
		int sem1=Integer.parseInt(request.getParameter("sem1"));
		int sem2=Integer.parseInt(request.getParameter("sem2"));
		int sem3=Integer.parseInt(request.getParameter("sem3"));
		int sem4=Integer.parseInt(request.getParameter("sem4"));
		String str="";
		float average=0;
		int sum=0;
		String grade="";
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		sum=(sem1+sem2+sem3+sem4);
		average=sum/4;
		if(average>=90)
		{
			grade="Excellent";
			System.out.println("Excellent");
		}
		else if(average>=80 && average<90)
		{
			grade="Very Good";
			System.out.println("Very good");
		}
		else if(average>=70 && average<80)
		{
			grade=" Good";
			System.out.println(" good");
		}
		else if(average>=60 && average<70)
		{
			grade=" Average";
			System.out.println("Average");
		}
		else
			grade="pass";
			System.out.println("Pass");
		}
		
		
		PreparedStatement ps=null;
		try {
			ps=con.prepareStatement("insert into users values(?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, contact);
			ps.setString(4, average);
			ps.setString(5, grade);
			
			int n=ps.executeUpdate();
			if(n!=0)
			{
				out.print("<h1>Insertion In DataBase Success.</h1>");
			}
			else
			{
				out.print("<h1>Insertion Failed.<.h1>");
			}
		
		
		
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
