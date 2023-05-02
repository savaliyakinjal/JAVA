<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">
<script src="https://code.jquery.com/jquery-3.6.1.min.js"
	integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
	crossorigin="anonymous">
	
</script>
<script>
	$(function() {
		$("#datepicker").datepicker({
			autoclose : true,
			todayHighlight : true,
		}).datepicker('update', new Date());
	});
</script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous">
	
</script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous">
	
</script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js">
	
</script>
<style>
label {
	margin-left: 20px;
}

#datepicker {
	width: 180px;
}

#datepicker>span:hover {
	cursor: pointer;
}
</style>
<title>Registration form</title>
</head>
<body>
	<div class="container">
		<div class="row mt-3">
			<div class="col-lg-4 m-auto">
				<div style="text-align: center;">
					<h1>Registration form</h1>
				</div>
				<span class="text-success">${msg}</span>
				<form action="reg" method="post">
					<div class="form-group mb-3">
						<label>Firstname</label> <input type="text" name="fname"
							id="fname" class="form-control">
					</div>
					<div class="form-group mb-3">
						<label>Lastname</label> <input type="text" name="lname" id="lname"
							class="form-control">
					</div>
					<div class="form-group mb-3">
						<label>Email</label> <input type="text" name="email" id="email"
							class="form-control">
					</div>
					<label>Date of birth</label>
					<div id="datepicker" class="input-group date form-group"
						data-date-format="dd-MM-yyyy">
						<input class="form-control" type="text" name="dob" readonly /> <span
							class="input-group-addon"> <i
							class="glyphicon glyphicon-calendar"></i>
						</span>
					</div>

					<button type="submit" class="btn btn-primary btn-lg" id="sbtn">Submit</button>
					<button type="reset" class="btn btn-primary btn-lg">Reset</button>
				</form>
				<a href="display">View all user</a>

			</div>
		</div>
	</div>
</body>
</html>