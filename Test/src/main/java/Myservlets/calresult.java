package Myservlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calresult")
public class calresult extends HttpServlet {
	private static final long serialVersionUID = 1L;
   Connection con;
    public calresult() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sem1=Integer.parseInt(request.getParameter("sem1"));
		int sem2=Integer.parseInt(request.getParameter("sem2"));
		int sem3=Integer.parseInt(request.getParameter("sem3"));
		int sem4=Integer.parseInt(request.getParameter("sem4"));
		String name=request.getParameter("sname");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		float avg=(sem1+sem2+sem3+sem4)/4;
		String grade=null;
		
		if(avg>=90)
		{
			grade="Excellent";
		}
		else if(avg>=80 && avg<90)
		{
			grade="Very good";
		}
		else if(avg>=70 && avg<80)
		{
			grade="Good";
		}
		else if(avg>=60 && avg<70)
		{
			grade="Average";
		}
		else if(avg>=40 && avg<60)
		{
			grade="Pass";
		}
		else if(avg<40)
		{
			grade="Fail";
		}
		
		PreparedStatement ps=null;
		try {
			ps=con.prepareStatement("insert into students(sname,email,conatct,average,grade)values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, contact);
			ps.setFloat(4, avg);
			ps.setString(5, grade);
			int n=ps.executeUpdate();
			
			RequestDispatcher rd=request.getRequestDispatcher("showTable");
			rd.forward(request, response);
		
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		con=(Connection)config.getServletContext().getAttribute("MyConnection");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
