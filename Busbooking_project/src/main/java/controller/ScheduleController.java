package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Schedule;

import java.io.IOException;
import java.io.PrintWriter;


import dao.CustomerDAO;


public class ScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDAO customerDao;

   
    public ScheduleController() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		customerDao = new CustomerDAO();
		PrintWriter out = response.getWriter();
		int Schedule_id = Integer.parseInt(request.getParameter("schedule_id"));
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		String route = request.getParameter("route");
		String departure_time = request.getParameter("departure_time");
		

		Schedule schedule = 
				new Schedule(Schedule_id,user_id, route, departure_time);

		try {
			int insert = customerDao.registerschedulePrepaedStatement(schedule);
			if (insert == 1) {
				out.print("Successfully added");
			} else {
				out.print("ERROR Adding Schedule");
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