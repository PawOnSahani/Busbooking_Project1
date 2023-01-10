package model;

public class Booking{
	
	int bus_id;
	String date_of_booking;
	int fare_amount;
	int total_amount;
	String initialDestination;
	String finalDestination;

	
	
	
	
	public Booking() {
	
	}
	public Booking( int bus_id, String date_of_booking, 
			int fare_amount,int total_amount,String initialDestination,String finalDestination) {		
		this.bus_id=bus_id;
		this.date_of_booking=date_of_booking;
		this.fare_amount=fare_amount;
		this.total_amount=total_amount;
		this.initialDestination=initialDestination;
		this.finalDestination=finalDestination;
	
	}
	

	public int getBus_id() {
		return this.bus_id;
	}

	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}

	public String getDate_of_booking() {
		return this.date_of_booking;
	}

	public void setDate_of_booking(String date_of_booking) {
		this.date_of_booking = date_of_booking;
	}

	public int getFare_amount() {
		return this.fare_amount;
	}

	public void setFare_amount(int fare_amount) {
		this.fare_amount = fare_amount;
	}

	public int getTotal_amount() {
		return this.total_amount;
	}

	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}

	public String getInitialDestination() {
		return this.initialDestination;
	}

	public void setInitialDestination(String initialDestination) {
		this.initialDestination = initialDestination;
	}

	public String getFinalDestination() {
		return this.finalDestination;
	}

	public void setFinalDestination(String finalDestination) {
		this.finalDestination = finalDestination;
	}
	

}