<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import="java.util.Calendar" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>

  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Bus booking</title>
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,600,700" rel="stylesheet">
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
</head>
<style>
<%@
include file="/css/dashboard.css"%>
</style> 



<body>


	
	<!-- SIDEBAR -->
	<section id="sidebar">
		<a href="#" class="brand">
			<i class='bx bxs-bus'></i>
			<span class="text">Bus_ticket_System</span>
		</a>
		<ul class="side-menu top">
			<li class="active">
				<a href="#">
					<i class='bx bxs-dashboard' ></i>
					<span class="text">Dashboard</span>
				</a>
			</li>
		
			<li>
				<a href="bus.jsp">
					<i class='bx bxs-bus-dots' ></i>
					<span class="text">Bus_Book</span>
				</a>
			</li>
			<li>
				<a href="Ticket.jsp">
					<i class='bx bxs-card-dots' ></i>
					<span class="text">Tickets</span>
				</a>
			</li>
				<li>
				<a href="Booking.jsp">
					<i class='bx bxs-booking-dots' ></i>
					<span class="text">Booking</span>
				</a>
			</li>
				<li>
				<a href="Maps.jsp">
					<i class='bx bxs-direction-dots' ></i>
					<span class="text">Routes</span>
				</a>
			</li>

		</ul>
		
	
		<ul class="side-menu">
			<li>
				<a href="#">
					<i class='bx bxs-cog' ></i>
					<span class="text">Settings</span>
				</a>
			</li>
			<li>
				<a href="/LogoutServlet" class="logout">
					<i class='bx bxs-log-out-circle' ></i>
					<span class="text">Logout</span>
				</a>
			</li>
		</ul>
	</section>
	<!-- SIDEBAR -->



	<!-- CONTENT -->
	<section id="content">
		<!-- NAVBAR -->
		<nav>
			
			<form action="#">
				<div class="form-input">
					<input type="search" placeholder="Search...">
					<button type="submit" class="search-btn"><i class='bx bx-search' ></i></button>
				</div>
			</form>
			<!-- Dark mode button -->
			
		</nav>
		<!-- NAVBAR -->

		<!-- MAIN -->
		<%

  String greeting = "Welcome to Bus_book";
  
%>

		<main>
			<div class="head-title">
				<div class="left">
					<h1><%= greeting %> <%=session.getAttribute("")%> <%=session.getAttribute("")%></h1>
					<ul class="BusTicket">
						<li>
							<a href="#">Let us guide you</a>
						</li>
					</ul>
				</div>
				
			</div>

			<ul class="box-info">
				<li>
					<i class='bx bsx-user' ></i>
					<span class="text">
						<h3>4</h3>
						<p>Customers</p>
					</span>
				</li>
				<li>
					<i class='bx bxs-book' ></i>
					<span class="text">
						<h3>9</h3>
						<p>Booking </p>
					</span>
				</li>
				<li>
					<i class='bx bxs-bus' ></i>
					<span class="text">
						<h3>2</h3>
						<p>Buses</p>
					</span>
				</li>
				
				<li>
					<i class='bx bsx-book' ></i>
					<span class="text">
						<h3>3</h3>
						<p>Availability</p>
					</span>
				</li>
				
				<li>
					<i class='bx bsx-book' ></i>
					<span class="text">
						<h3>2</h3>
						<p>Routes</p>
					</span>
				</li>
				
				<li>
					<i class='bx bsx-book' ></i>
					<span class="text">
						<h3>m|d|y</h3>
						<p>Date</p>
					</span>
				</li>
			</ul>

</body>
</html>