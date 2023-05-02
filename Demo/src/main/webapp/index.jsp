<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="regis" method="post">
		<span class="text-success">${msg}</span> <label>name</label> <input
			type="text" name="name" placeholder="Enter your name">
		<div class="list-group form-group">
			<label class="list-group-item"> <input
				class="form-check-input me-1" type="checkbox" value="surat"
				name="add"> Surat
			</label> <label class="list-group-item"> <input
				class="form-check-input me-1" type="checkbox" value="vapi"
				name="add"> Vapi
			</label> <label class="list-group-item"> <input
				class="form-check-input me-1" type="checkbox" value="Kamrej"
				name="add"> Kamrej
			</label> <label class="list-group-item"> <input
				class="form-check-input me-1" type="checkbox" value="navsari"
				name="add"> Navasari
			</label> 

		</div>


		<button type="submit">Submit</button>
	</form>
</body>
</html>