<%@page import="java.awt.Checkbox"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="reg" method="post">
		<div class="list-group">
			<label class="list-group-item"> <input
				class="form-check-input me-1" type="checkbox" value="java" name="skills">
				Java
			</label> <label class="list-group-item"> <input
				class="form-check-input me-1" type="checkbox" value="sql" name="skills">
				Sql
			</label> <label class="list-group-item"> <input
				class="form-check-input me-1" type="checkbox" value="c" name="skills">
				c 
			</label> <label class="list-group-item"> <input
				class="form-check-input me-1" type="checkbox" value="c++" name="skills">
				c++
			</label> <label class="list-group-item"> <input
				class="form-check-input me-1" type="checkbox" value="react" name="skills">
				React
			</label>
		</div>
		
		<button type="submit">submit</button>
	</form>
</body>
</html>