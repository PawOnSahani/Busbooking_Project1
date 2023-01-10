
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Customer</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="js/register.js"></script>
<script src="js/bootstrap.min.js"></script>



</head>
<body>
	<div class="container">
		<center>
			<h1>Book Ticket Booking </h1>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/RegisterController" method="post">

					<div class="form-group row">
						<label for="custname" class="col-sm-2 col-form-label">Custname</label>
						<div class="col-sm-7">
							<input type="text" name="custname" class="form-control"
								name="custname" placeholder="Enter user name">
						</div>
					</div>

					<div class="form-group row">
						<label for="password" class="col-sm-2 col-form-label">Password</label>
						<div class="col-sm-7">
							<input type="text" class="form-control"
								name="password" placeholder="Enter password">
						</div>
					</div>
					
					<div class="form-group row">
						<label for="fullname" class="col-sm-2 col-form-label">Fullname</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="fullname"
								placeholder="Enter Full name">
						</div>
					</div>
					<div class="form-group row">
						<label for="contact" class="col-sm-2 col-form-label">Contact</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="contact"
								placeholder="Enter contact">
						</div>
					</div>
					
					<div class="form-group row">
						<label for="email" class="col-sm-2 col-form-label">Email</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="email"
								placeholder="Enter Email">
						</div>
					</div>
					
					
					<div class="form-group row">
						<label for="address" class="col-sm-2 col-form-label">Address</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="address"
								placeholder="Enter Address">
						</div>
					</div>


					

					
					</div>
					<button type="submit" class="btn btn-primary">Register Customer</button>
				</form>
			</div>
		</div>
	</div>
	<!-- /.container -->
</body>
</html>