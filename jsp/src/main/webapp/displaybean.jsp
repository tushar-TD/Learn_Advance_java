<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class="beans.User" scope="request"></jsp:useBean>
	<h1>Welcome <jsp:getProperty property="name" name="user"/></h1>
	<br/>
	Email:<jsp:getProperty property="email" name="user"/>
	<br/>
	Contact:<jsp:getProperty property="contact" name="user"/>
	<%-- PinCode:<jsp:getProperty property="pin" name="user"/> --%>
</body>
</html>