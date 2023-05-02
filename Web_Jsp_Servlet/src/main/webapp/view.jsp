
<%@page import="model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>

<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>display</title>
</head>
<body>
	<div class="container">
		<div class="row mt-3">
			<div class="col-lg-12 m-auto">
				<h1 align="center" class="text-success">Employee List</h1>

				<h1>Employee List</h1>
				<table border="1" width="100%" class="table table-striped">

					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Skills</th>
						<th>Age</th>
						<th>Salary</th>
						<th>Joining Date</th>
						<th colspan="2">Action</th>
					</tr>

					<%
					ArrayList<Employee> em = (ArrayList) request.getAttribute("data");
					for (Employee e : em) {
					%>
					<tr>
						<td><%=e.getEmployeeId()%></td>
						<td><%=e.getEmpName()%></td>
						<td><%=e.getSkill()%></td>
						<td><%=e.getAge()%></td>
						<td><%=e.getSalary()%></td>
						<td><%=e.getJoiningDate()%></td>
						<td><a href="delete?did=<%=e.getEmployeeId()%>">Delete</a></td>
						<td><a href="update?uid=<%=e.getEmployeeId()%>">Update</a></td>

					</tr>

					<%
					}
					%>

				</table>
			</div>
		</div>
	</div>
</body>
</html>