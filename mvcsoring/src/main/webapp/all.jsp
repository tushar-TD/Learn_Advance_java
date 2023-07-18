<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<c:forEach var="emp" items="${emplist }">
			<tr>
				<td> ${emp.empid } </td>
				<td> ${emp.ename } </td>
				<td> ${emp.deptno } </td>
				<td> ${emp.salary } </td>
				<td> <a href="edit?empid=${emp.empid }"> edit </a></td>
				<td> <a href="delete?empid=${emp.empid }"> delete </a></td>
			</tr>
		</c:forEach>
	</table>

	<a href="insert"> Insert  </a>

</body>
</html>