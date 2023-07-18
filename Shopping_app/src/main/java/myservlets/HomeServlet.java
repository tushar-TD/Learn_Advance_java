package myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;

	public void init(ServletConfig config) throws ServletException {
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/header");
		rd.include(request, response);
		Statement st = null;
		ResultSet rs = null;
		try
		{
			st = con.createStatement();
			rs = st.executeQuery("select * from category");
			while(rs.next())
			{
				out.println("<a href='getproducts?cid="+rs.getInt(1)+"'> "+ rs.getString(2).toUpperCase()+" </a> <br/>");
			}
			out.print("<br/> <br/> <a href='logout'> Logout <a/>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				rs.close();
				st.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}