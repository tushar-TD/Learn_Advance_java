<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome From JSP</h1>
	This is without any markup
	<!-- HTML Comment -->
	<%-- JSP Comment --%>
	<% out.print("<h1>Welcome From Scriptlet</h1>"); %>
	<%= Calendar.getInstance().getTime() %>
	<br/>
	<br/>
	<%! int value;  %>
	<%= "value of iVar : "+(++value)  %>
</body>
</html>

