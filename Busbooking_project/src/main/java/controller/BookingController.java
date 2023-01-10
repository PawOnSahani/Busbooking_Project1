package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Booking;
import model.User;

import java.io.IOException;
import java.io.PrintWriter;


import dao.CustomerDAO;


public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDAO customerDao;

   
    public BookingController() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		customerDao = new CustomerDAO();
		PrintWriter out = response.getWriter();
		int bus_id = Integer.parseInt(request.getParameter("bus_id"));
		String date_of_booking =request.getParameter("date_of_booking");
		int fare_amount = Integer.parseInt(request.getParameter("Fare_amount"));
		int total_amount = Integer.parseInt(request.getParameter("total_amount"));
		String initial_Destination = request.getParameter("initial_Destinatio");
		String final_Destination = request.getParameter("final_Destination");

		Booking booking = 
				new Booking(bus_id, date_of_booking,fare_amount, total_amount, initial_Destination, final_Destination);

		try {
			int insert = customerDao.registerBookingPrepaedStatement(booking);
			if (insert == 1) {
				out.print("Successfully added");
			} else {
				out.print("ERROR registring customer");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}



//public Customer(int custId, String custFname, String custLname, char gender, 
//		String phoneNo, String address,String username, String password) {
//	this.custId = custId;
//	this.custFname = custFname;
//	this.custLname = custLname;
//	this.gender = gender;
//	this.phoneNo = phoneNo;
//	this.address = address;
//	this.username = username;
//	this.password = password;
//}