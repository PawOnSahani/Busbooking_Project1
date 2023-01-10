package dao;


import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;
import database.DbConnection;
import model.Booking;
import model.Bus;
import model.Schedule;
import model.Ticket;
import model.User;


public class CustomerDAO {

    DbConnection db = new DbConnection();

    public int registerUserPrepaedStatement(User user) {
        try {
            String query = "insert into Customer(custname,password,fullname,contact,email,address)values(?,?,?,?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, user.getCustname());
            st.setString(2, user.getPassword());
            st.setString(3,  user.getFullname());
            st.setString(4, user.getContact());
            st.setString(5, user.getEmail());
            st.setString(6, user.getAddress());

            return db.manipulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
   

        public int registerschedulePrepaedStatement(Schedule schedule) {
            try {
                String query = "insert into schedule(schedule_id,user_id,route,Departure_time"+") values(?,?,?,?)";

                PreparedStatement st = db.con.prepareStatement(query);

                st.setInt(1, schedule.getSchedule_id());
                st.setInt(2, schedule.getUser_id());
                st.setString(3,  schedule.getRoute());
                st.setString(5, schedule.getDeparture_time());

                return db.manipulate(st);
            } catch (SQLException e) {
                e.printStackTrace();
                return 0;
            }
        }
        
        
        public int registerBookingPrepaedStatement(Booking booking) {
            try {
                String query = "insert into booking(bus_id,date_of_booking,fare_amount,total_amount,initialDestination,finalDestination) values(?,?,?,?,?,?)";

                PreparedStatement st = db.con.prepareStatement(query);
             
                st.setInt(1, booking.getBus_id());
                st.setString(2, booking.getDate_of_booking());
                st.setInt(3, booking.getFare_amount());
                st.setInt(4, booking.getTotal_amount());
                st.setString(5, booking.getInitialDestination());
                st.setString(6, booking.getFinalDestination());
                
               

                return db.manipulate(st);
            } catch (SQLException e) {
                e.printStackTrace();
                return 0;
            }
        }
        
        
        
        public int registerTicketPrepaedStatement(Ticket ticket) {
            try {
                String query = "insert into Ticket(book_id,ticket_no) values(?,?)";

                PreparedStatement st = db.con.prepareStatement(query);
                st.setInt(1, ticket.getBook_id());
                st.setInt(2, ticket.getTicket_no());
                
              
                
                 return db.manipulate(st);
            } catch (SQLException e) {
                e.printStackTrace();
                return 0;
            }
        }
        
        
        
    
  
            
          
                public int registerBusPrepaedStatement(Bus bus) {
                    try {
                        String query = "insert into Bus(bus_id,bus_no,capacity,schedule_id) values(?,?,?,?)";

                        PreparedStatement st = db.con.prepareStatement(query);
                        st.setInt(1, bus.getBus_id());
                        st.setString(2, bus.getBus_no());
                        st.setString(3, bus.getCapacity());
                        st.setInt(4,  bus.getSchedule_id());
                       

                        return db.manipulate(st);
                    } catch (SQLException e) {
                        e.printStackTrace();
                        return 0;
                    }
                }
                
                
                
            
            
            
            

   
	


	// Login customer
    public User loginUser(String custname, String password) {
        String query;
        query = "select * from customer where custname = '" + custname +
                "' and password = '" + password + "';";

        ResultSet rs = db.retrieve(query);
        User user = null;

        try {
            while (rs.next()) {
                user = new User();
                user.setCustname(rs.getString("custname"));
                user.setPassword(rs.getString("password"));
                user.setFullname(rs.getString("fullname"));
                
                user.setContact(rs.getString("contact"));
                user.setEmail(rs.getString("email"));

                user.setAddress(rs.getString("address"));
                
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return user;
    }



   public List<User> getAllUser(){
        String query;
        query = "select * from user";
        db = new DbConnection();
        ResultSet rs = db.retrieve(query);
        List<User> lstUser = new ArrayList<User>();

        try {
            while (rs.next()) {
                User user = new User();
                user.setCustname(rs.getString("Customer"));
                user.setPassword(rs.getString("password"));
                user.setFullname(rs.getString("fullname"));
                user.setContact(rs.getString("contact"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));

                lstUser.add(user);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstUser;
    }
            
    
    
    
    
}






//// Register customer;
//public int registerCustomer(Customer customer) {
//  String query;
//
//  query = "insert into customer(custFname,custLname,gender,phoneNo," +
//          "address,username,password) values('" +
//          customer.getCustFname() + "','" +
//          customer.getCustLname() + "','" +
//          customer.getGender() + "','" +
//          customer.getPhoneNo() + "','" +
//          customer.getAddress() + "','" +
//          customer.getUsername() + "','" +
//          customer.getPassword() + "');";
//
//  return db.maniulate(query);
//}