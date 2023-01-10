package model;

public class Schedule{
	
	int Schedule_id;
	int user_id;
	String route;
	String Departure_time;
	
	
	
	public Schedule() {
	
	}
	public Schedule(int Schedule_id, int user_id, String route, 
			String Departure_time) {
		this.Schedule_id =Schedule_id;
		this.user_id = user_id;
		this.route=route;
		this.Departure_time=Departure_time;
	
	}
	public int getSchedule_id() {
		return this.Schedule_id;
	}

	public void setSchedule_id(int Schedule_id) {
		this.Schedule_id = Schedule_id;
	}

	public int getUser_id() {
		return this.user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getDeparture_time() {
		return this.Departure_time;
	}

	public void setDeparture_time(String Departure_time) {
		this.Departure_time = Departure_time;
	}

    

}
	
		
	