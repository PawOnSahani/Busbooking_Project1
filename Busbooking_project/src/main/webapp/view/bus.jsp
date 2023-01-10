<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking</title>
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
			<h1>Booking </h1>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/BusController"
					method="post">
					

					
					
					<div class="form-group row">
						<label for="bus_id" class="col-sm-2 col-form-label">Bus ID</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="bus_id"
								placeholder="Enter bus id">
						</div>
						</div>
						
							<div class="form-group row">
						<label for="capacity" class="col-sm-2 col-form-label">capacity</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="capacity"
								placeholder="Enter the capacity of buses">
						</div>
					</div>
						
						

					<div class="form-group row">
						<label for="Bus_no" class="col-sm-2 col-form-label">Bus_no
							</label>
						<div class="col-sm-7">
							<input type="text" name="Bus_no" class="Form-control"
								name="Bus_no" placeholder="Enter the number of bus">
						</div>
					</div>
					
				
					<div class="form-group row">
						<label for="schedule_id" class="col-sm-2 col-form-label">schedule_id</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="schedule_id"
								placeholder="Enter schedule_id ">
						</div>
					</div>
					
					

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
	<!-- /.container -->
</body>
</html>