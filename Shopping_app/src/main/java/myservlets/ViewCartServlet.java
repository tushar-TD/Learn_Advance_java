package myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import myclasses.User;

@WebServlet("/viewcart")
public class ViewCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/header");
		rd.include(request, response);
		HttpSession session=request.getSession();
		List<Integer> sps=(List<Integer>)session.getAttribute("cart");
		if(sps==null)
		{
			out.print("<p>Product Not Selected</p>");
		}
		else
		{
			PreparedStatement ps=null;
			ResultSet rs=null;
			String str="";
			str+="<table border='1'>";
			str+="<th>Sr.No</th>";
			str+="<th>P.Name</th>";
			str+="<th>Price</th>";
			try
			{
				ps=con.prepareStatement("select * from product where p_id = ?");
				int cnt=0;
				float tprice=0;
				for(int n:sps)
				{
					ps.setInt(1, n);
					rs=ps.executeQuery();
					if(rs.next())
					{
						str+="<tr>";
						str+="<td>"+(++cnt)+"</td>";
						str+="<td>"+rs.getString(2)+"</td>";
						str+="<td>"+rs.getString(4)+"</td>";
						str+="<td><a href='deleteItem?pid="+cnt+"'>delete</a></td>";
						tprice+=Float.parseFloat(rs.getString(4));
						str+="</tr>";
						session.setAttribute("cnt", cnt);
					}	
					
				}
				
				session.setAttribute("tprice", tprice);
				str+="<tr>";
				str+="<td colspan='2'>Total Price</td>";
				str+="<td>"+tprice+"</td>";
				str+="</tr>";
				str+="</table>";
				out.print(str);
				out.print("<br/><a href='confirmcart'> Confirm Cart <a/>");
				out.print("<br/><br/><a href='home'> Go back to Categories <a/>");
				out.print("<br/><br/><a href='logout'> Logout <a/>");
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
			finally 
			{
				try 
				{
					rs.close();
					ps.close();
				}
				catch(Exception e) {
					e.getStackTrace();
				}
				
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
