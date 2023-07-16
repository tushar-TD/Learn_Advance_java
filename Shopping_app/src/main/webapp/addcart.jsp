<%@ page import="java.util.*,java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		RequestDispatcher rd = request.getRequestDispatcher("/header");
		rd.include(request, response);
		int spid=Integer.parseInt(request.getParameter("selectedP"));
		List<Integer> products =(List<Integer>)session.getAttribute("cart");
		if(products == null) 
		{
			products = new ArrayList<>(); 
		}
		products.add(spid);
		session.setAttribute("cart", products);
		%>
		<%= "<br/>selected product "+spid+" is added in the cart" %>
		<%= "<br/>There are "+ products.size()+" item(s) in the cart" %>
		<%= "<br/> <a href='viewcart.jsp'> View Cart <a/>" %>
		<%= "<br/> <a href='home'> Go back to Categories <a/>" %>
		<%= "<br/> <br/> <a href='logout'> Logout <a/>" %>
</body>
</html>