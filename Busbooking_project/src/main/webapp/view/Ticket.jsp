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
			<h1>Ticket </h1>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/TicketController"
					method="post">

					<div class="form-group row">
						<label for="book_id" class="col-sm-2 col-form-label">Book ID
							</label>
						<div class="col-sm-7">
							<input type="text" name="book_id" class="form-control"
								name="book_id" placeholder="Enter the booking id">
						</div>
					</div>
					
			
					<div class="form-group row">
						<label for="ticket_no" class="col-sm-2 col-form-label">ticket_no</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="ticket_no"
								placeholder="Enter Ticket number">
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