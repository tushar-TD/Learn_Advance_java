package Myservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/DBDA" }, initParams = {
		@WebInitParam(name = "course", value = "DBDA")
})
public class dbda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();

		ServletConfig config = this.getServletConfig();
		String subject = config.getInitParameter("course");

		ServletContext ctx = getServletContext();
		String provider = ctx.getInitParameter("Provider");

		out.println("Training on " + subject + " by " + provider);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
