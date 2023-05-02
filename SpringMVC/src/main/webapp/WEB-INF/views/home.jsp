<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee List</h1>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>pass</th>
			<th>Action</th>
		</tr>

		<c:forEach var="dt" items="${data}">
			<tr>
				<td>${dt.getId()}</td>
				<td>${dt.getName()}</td>
				<td>${dt.getEmail()}</td>
				<td>${dt.getPass()}</td>
				<td><a href="delete?uid=${dt.getId()}">Delete</a></td>
				<td><a href="update?uid=${dt.getId()}">Update</a></td>
			</tr>
		</c:forEach>


	</table>
</body>
</html>