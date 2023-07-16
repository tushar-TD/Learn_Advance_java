package myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import myclasses.User;


@WebServlet("/deleteItem")
public class DeleteOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		HttpSession session=request.getSession();
		//User u=(User)session.getAttribute("cart");
		List<Integer> sps=(List<Integer>)session.getAttribute("cart");
		if(sps==null)
		{
			sps = new ArrayList<>(); 
		}                             
		sps.remove(pid-1);
		session.setAttribute("cart", sps);
		response.sendRedirect("/ShoppingApp/viewcart");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
