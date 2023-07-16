package myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addcart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/header");
		rd.include(request, response);
		int spid=Integer.parseInt(request.getParameter("selectedP"));
		HttpSession session=request.getSession();
		List<Integer> products =(List<Integer>)session.getAttribute("cart");
		if(products == null) 
		{
			products = new ArrayList<>(); 
		}
		products.add(spid);
		session.setAttribute("cart", products);
		
		String str="";
		str+="<br/>selected product "+spid+" is added in the cart";
		str+="<br/>There are "+ products.size()+" item(s) in the cart";
		str+="<br/> <a href='viewcart'> View Cart <a/>";
		str+="<br/> <a href='home'> Go back to Categories <a/>";
		out.println(str);
		out.print("<br/> <br/> <a href='logout'> Logout <a/>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
