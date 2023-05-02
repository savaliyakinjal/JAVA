<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>

<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display</title>
</head>
<body>

	<h1 align="center" class="text-success">User List</h1>
	
	<h1>User List</h1>
	<table border="1" width="100%">

		<tr>
			<th>Id</th>
			<th>Fname</th>
			<th>Lname</th>
			<th>Email</th>
			<th>Date of birth</th>
			<th colspan="2">Action</th>
		</tr>

		<%
		ArrayList<User> us = (ArrayList) request.getAttribute("data");
		for (User u : us) {
		%>
		<tr>
			<td><%=u.getUserid()%></td>
			<td><%=u.getFirstName()%></td>
			<td><%=u.getLastName()%></td>
			<td><%=u.getEmail()%></td>
			<td><%=u.getDob()%></td>
			<td><a href="delete?did=<%=u.getUserid()%>">Delete</a></td>
			<td><a href="update?uid=<%=u.getUserid()%>">Update</a></td>

		</tr>

		<%
		}
		%>

	</table>
</body>
</html>