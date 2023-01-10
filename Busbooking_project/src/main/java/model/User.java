 package model;

public class User{
	
	
	String custname;
	String password;
	String fullname;
	String contact;
	String email;
	String address;
	
	
	public User() {
		
	}
	
	public User(String custname, String password, String fullname, 
			String contact, String email,String address) {
		this.custname = custname;
		this.password = password;
		this.fullname=fullname;
		this.contact=contact;
		this.email = email;
		this.address = address;
		
	}
	
	// Getter and Setter

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}