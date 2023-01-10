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
			<h1>Booking_bus</h1>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/BookingController"
					method="post">
					

					
					
					<div class="form-group row">
						<label for="bus_id" class="col-sm-2 col-form-label">Bus ID</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="bus_id"
								placeholder="Enter bus id">
						</div>
						</div>
						
							<div class="form-group row">
						<label for="date_of_booking" class="col-sm-2 col-form-label">date of booking</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="date_of_booking"
								placeholder="Enter date of booking">
						</div>
					</div>
						
						

					<div class="form-group row">
						<label for="Fare_amount" class="col-sm-2 col-form-label">Fare amount
							</label>
						<div class="col-sm-7">
							<input type="text" name="Fare_amount" class="Form-control"
								name="Fare_amount" placeholder="Enter Fare amount">
						</div>
					</div>
					
				
					<div class="form-group row">
						<label for="total_amount" class="col-sm-2 col-form-label">total amount</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="total_amount"
								placeholder="Enter total_amount">
						</div>
					</div>
					
						<div class="form-group row">
						<label for="initialDestination" class="col-sm-2 col-form-label">Initial Destination</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="initialDestination"
								placeholder="Enter Initial destination">
						</div>
						</div>
						
						<div class="form-group row">
						<label for="finalDestination" class="col-sm-2 col-form-label">Final Destination</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="finalDestination"
								placeholder="Enter Final destination">
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