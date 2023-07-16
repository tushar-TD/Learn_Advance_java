package myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getproducts")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid=Integer.parseInt(request.getParameter("cid"));
		PrintWriter out=response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/header");
		rd.include(request, response);
		PreparedStatement ps=null;
		ResultSet rs=null;
		try 
		{
			ps=con.prepareStatement("select * from product where cat_id = ?");
			ps.setInt(1, cid);
			rs=ps.executeQuery();
			String str="";
			str+="<form action=addcart>";
			str+="Select Product:";
			str+="<select name='selectedP'>";
			while(rs.next())
			{
				str+="<option value='"+rs.getInt(1)+"'>"+rs.getString(2)+"</option>";
			}
			str+="</select>";
			str+="<br/> <input type='submit' value='Add To Cart' />";
			str+="</form>";
			out.println(str);
			out.print("<br/> <br/> <a href='home'> Go back to Categories <a/>");
			out.print("<br/> <br/> <a href='logout'> Logout <a/>");
		}
		catch(Exception e){
			e.getStackTrace();
		}
		finally {
			try {
				
			}
			catch(Exception e) {
				e.getStackTrace();
			}
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
