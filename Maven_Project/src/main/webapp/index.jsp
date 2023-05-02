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
			<div class="col-lg-6 m-auto">
				<div style="text-align: center;">
					<h1>Registration form</h1>
				</div>
				
				<form action="reg" method="post">
					<div class="form-group mb-3">
						<label>Employee Name</label> <input type="text" name="ename"
							id="ename" class="form-control">
					</div>

					<label>Skills</label>
					<div class="list-group form-group">
						<label class="list-group-item"> <input
							class="form-check-input me-1" type="checkbox" value="Java" name="skills">
							Java
						</label> <label class="list-group-item"> <input
							class="form-check-input me-1" type="checkbox" value="C and C++" name="skills">
							C and C++
						</label> <label class="list-group-item"> <input
							class="form-check-input me-1" type="checkbox" value="PHP" name="skills">
							PHP
						</label> <label class="list-group-item"> <input
							class="form-check-input me-1" type="checkbox" value="SQL" name="skills">
							SQL
						</label> <label class="list-group-item"> <input
							class="form-check-input me-1" type="checkbox" value="CSS" name="skills">
							CSS
						</label> <label class="list-group-item"> <input
							class="form-check-input me-1" type="checkbox" value="HTML" name="skills">
							HTML
						</label> <label class="list-group-item"> <input
							class="form-check-input me-1" type="checkbox" value="Javascript" name="skills">
							Javascript
						</label>

					</div>


					<div class="form-group mb-3">
						<label>Age</label> <input type="number" name="age" id="age"
							class="form-control">
					</div>
					<div class="form-group mb-3">
						<label>Salary</label> <input type="number" name="salary"
							id="salary" class="form-control">
					</div>
					<label>Joining Date</label>
					<div id="datepicker" class="input-group date form-group"
						data-date-format="dd-MM-yyyy">
						<input class="form-control" type="text" name="joiningdate" readonly /> <span
							class="input-group-addon"> <i
							class="glyphicon glyphicon-calendar"></i>
						</span>
					</div>

					<button type="submit" class="btn btn-primary btn-lg mb-3" id="sbtn">Submit</button>
					<button type="reset" class="btn btn-primary btn-lg mb-3">Reset</button>
				</form>
				<a href="display">View all employee</a>

			</div>
		</div>
	</div>
</body>
</html>