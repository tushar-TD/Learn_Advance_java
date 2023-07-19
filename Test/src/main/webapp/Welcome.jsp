<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <table  border=1>
   <c:forEach var="student" items="${students}">
   <tr>
   <td>${student.sid}</td>
   <td>${student.sname}</td>
   <td>${student.email}</td>
   <td>${student.contact}</td>
   <td>${student.average}</td>
   <td>${student.grade}</td>
   </tr>
   </c:forEach>
   </table>
   
</body>
</html>