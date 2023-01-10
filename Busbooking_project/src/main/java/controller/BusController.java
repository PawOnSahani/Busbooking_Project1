package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Booking;
import model.Bus;
import model.User;

import java.io.IOException;
import java.io.PrintWriter;


import dao.CustomerDAO;


public class BusController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDAO customerDao;

   
    public BusController() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		customerDao = new CustomerDAO();
		PrintWriter out = response.getWriter();
		int bus_id = Integer.parseInt(request.getParameter("bus_id"));
		String capacity =request.getParameter("capacity");
		String Bus_no = request.getParameter("bus_no");
		int schedule_id = Integer.parseInt(request.getParameter("schedule_id"));
	

		Bus bus =new Bus(bus_id,capacity,Bus_no, schedule_id);

		try {
			int insert = customerDao.registerBusPrepaedStatement(bus);
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