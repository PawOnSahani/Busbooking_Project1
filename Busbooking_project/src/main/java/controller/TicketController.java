package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ticket;

import java.io.IOException;
import java.io.PrintWriter;

import dao.CustomerDAO;


public class TicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDAO customerDao;

   
    public TicketController() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		customerDao = new CustomerDAO();
		PrintWriter out = response.getWriter();
		int book_id = Integer.parseInt(request.getParameter("book_id"));
		int ticket_no = Integer.parseInt(request.getParameter("ticket_no"));
		
		

		Ticket ticket = 
				new Ticket(book_id, ticket_no);

		try {
			int insert = customerDao.registerTicketPrepaedStatement(ticket);
			if (insert == 1) {
				out.print("Successfully added");
			} else {
				out.print("ERROR ");
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