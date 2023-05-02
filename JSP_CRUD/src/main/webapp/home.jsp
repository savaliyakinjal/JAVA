<%@page import="model.Student"%>
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
<%
	String email = (String) session.getAttribute("email");
	if (email == null) {
		request.setAttribute("msg", "please login first");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	%>
	<h1 align="center" class="text-success">Student List</h1>
	<h2>
		Welcome,
		<%=email%>
		| <a href="logout">Logout</a>
	</h2>
	<h1>Student List</h1>
	<table border="1" width="100%">

		<tr>
			<th>Id</th>
			<th>Fname</th>
			<th>Lname</th>
			<th>Email</th>
			<th>Password</th>
			<th>Phno</th>
			<th colspan="2">Action</th>
		</tr>

		<%
		ArrayList<Student> st = (ArrayList) request.getAttribute("data");
		for (Student s : st) {
		%>
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getFname()%></td>
			<td><%=s.getLname()%></td>
			<td><%=s.getEmail()%></td>
			<td><%=s.getPass()%></td>
			<td><%=s.getPhno()%></td>
			<td><a href="delete?did=<%=s.getId()%>">Delete</a></td>
			<td><a href="update?uid=<%=s.getId()%>">Update</a></td>

		</tr>

		<%
		}
		%>

	</table>
</body>
</html>