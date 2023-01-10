 package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;
import java.io.PrintWriter;

import dao.CustomerDAO;



public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public RegisterController() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		 CustomerDAO customerDao = new CustomerDAO();
		PrintWriter out = response.getWriter();
		String Custname = request.getParameter("custname");
		String Password = request.getParameter("password");
		String fullname = request.getParameter("fullname");
		String contact = request.getParameter("contact");
		
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		

		User user= new User(Custname, Password,fullname,contact,email,address);

		try {
			 //customerDao = null;
			//@SuppressWarnings("null")
			int insert = customerDao.registerUserPrepaedStatement(user);
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