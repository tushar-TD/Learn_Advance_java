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
	<jsp:setProperty name="user" property="name" param="name"/>
	<jsp:setProperty name="user" property="email" param="email"/>
	<jsp:setProperty name="user" property="contact" param="contact"/>
	
	<%--<jsp:setProperty name="user" property="city" param="city"/>
	<jsp:setProperty name="user" property="area" param="area"/>
	<jsp:setProperty name="user" property="pin" param="pin"/>--%>
	
	<jsp:forward page="/displaybean.jsp" />
</body>
</html>