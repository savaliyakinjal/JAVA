<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<title>login</title>
</head>
<body>
<div class="container">
		<div class="row">
			<div class="col-lg-4 m-auto">


				<h1>Login form</h1>
				<form action="login" method="post">
					<span class="text-danger">${msg}</span>
					
					
					<div class="form-group">
					<label>Email</label> <input type="text" name="email" id="email" class="form-control" onkeyup="validation()">
					<span id="emailE" class="text-danger"></span>
					</div>
					<div class="form-group">
					<label>Password</label> <input type="text" name="pass" id="pass" class="form-control" onkeyup="validation()">
					<span id="passE" class="text-danger"></span>
					</div>
					
					
					 <input type="submit" class="btn btn-success" id="sbtn">
					 			</form>
				<a href="index.jsp">Register here</a>
			</div>
		</div>
	</div>
</body>
</html>