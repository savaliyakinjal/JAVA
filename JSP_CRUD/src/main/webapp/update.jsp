<%@page import="model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<title>Insert title here</title>
<script type="text/javascript">
	function validation() {
		var fname = document.getElementById("fname").value
		var lname = document.getElementById("lname").value
		var email = document.getElementById("email").value
		var pass = document.getElementById("pass").value
		var cpass = document.getElementById("cpass").value
		var phno = document.getElementById("phno").value
		var fnameE = document.getElementById("fnameE");
		var lnameE = document.getElementById("lnameE");
		var emailE = document.getElementById("emailE");
		var passE = document.getElementById("passE");
		var cpassE = document.getElementById("cpassE");
		var phnoE = document.getElementById("phnoE");
		var sbtn = document.getElementById("sbtn");
		var emailExp = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/
		var passExp = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
		var phnoExp = /^\d{10}$/;
		if (fname == "" || fname == null) {
			fnameE.innerHTML = "Firstname should not be blank"
			sbtn.disabled = true;
			return;
		} else {
			fnameE.innerHTML = ""
			sbtn.disabled = false;
		}
		if (lname == "" || lname == null) {
			lnameE.innerHTML = "Lastname should not be blank"
			sbtn.disabled = true;
			return;
		} else {
			lnameE.innerHTML = ""
			sbtn.disabled = false;
		}
		if (email == "" || email == null) {
			emailE.innerHTML = "Email should not be blank"
			sbtn.disabled = true;
			return;
		} else if (!emailExp.test(email)) {
			emailE.innerHTML = "Invalid email format"
		} else {
			emailE.innerHTML = ""
			sbtn.disabled = false;
		}
		if (pass == "" || pass == null) {
			passE.innerHTML = "Password should not be blank"
			sbtn.disabled = true;
			return;
		} else if (!passExp.test(pass)) {
			passE.innerHTML = "Invalid password	"
			return;
		} else {
			passE.innerHTML = ""
			sbtn.disabled = false;
		}
		if (cpass != pass) {
			cpassE.innerHTML = "confirm password should be same as a password"
			sbtn.disabled = true;
			return;
		} else {
			cpassE.innerHTML = ""
			sbtn.disabled = false;
		}
		if (phno == "" || phno == null) {
			phnoE.innerHTML = "Phone Number should not be blank"
			sbtn.disabled = true;
			return;
		} else if (!phnoExp.test(phno)) {
			phnoE.innerHTML = "Invalid phone Number"
			return;
		} else {
			phnoE.innerHTML = ""
			sbtn.disabled = false;
			return false;
		}
	}
</script>
</head>
<body>
<div class="container">
		<div class="row mt-3">
			<div class="col-lg-4 m-auto">
			
			<%
			Student st=(Student)request.getAttribute("std");
			%>
			
			
				<div style="text-align: center;">
					<h1>Update Form</h1>
				</div>
				
				
				<form action="update" method="post">
				<span class="text-success">${msg}</span>
				<input type="hidden" value="<%=st.getId()%>" name="id">
					<div class="form-group mb-3">
						<label>Firstname</label> <input type="text" name="fname"
							id="fname" class="form-control" value=<%=st.getFname()%> onkeyup="validation()"> <span
							id="fnameE" class="text-danger"></span>
					</div>
					<div class="form-group mb-3">
						<label>Lastname</label> <input type="text" name="lname" id="lname"
							class="form-control"value=<%=st.getLname()%> onkeyup="validation()"> <span
							id="lnameE" class="text-danger"></span>
					</div>
					<div class="form-group mb-3">
						<label>Email</label> <input type="text" name="email" id="email"
							class="form-control"value=<%=st.getEmail()%> onkeyup="validation()"> <span
							id="emailE" class="text-danger"></span>
					</div>
					<div class="form-group mb-3">
						<label>Password</label> <input type="text" name="pass" id="pass"
							class="form-control" value=<%=st.getPass()%> onkeyup="validation()"> <span
							id="passE" class="text-danger"></span>
					</div>
					<div class="form-group mb-3">
						<label>confirm password</label> <input type="text" name="cpass"
							id="cpass" class="form-control" onkeyup="validation()"> <span
							id="cpassE" class="text-danger"></span>
					</div>
					<div class="form-group mb-3">
						<label>phno</label> <input type="text" name="phno" id="phno"
							class="form-control" value=<%=st.getPhno()%> onkeyup="validation()"> <span
							id="phnoE" class="text-danger"></span>
					</div>
					<button type="submit" class="btn btn-primary btn-lg" id="sbtn">Submit</button>
					<button type="reset" class="btn btn-primary btn-lg">Reset</button>
				</form>

			</div>
		</div>
	</div>
</body>
</html>