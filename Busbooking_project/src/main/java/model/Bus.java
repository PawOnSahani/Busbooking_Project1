package model;

public class Bus{
	
	int Bus_id;
	String capacity;
	String Bus_no;
	int schedule_id;
	
	
	
	public Bus() {
	
	}
	public Bus(int Bus_id, String Bus_no, String Capacity, 
			int Schedule_id) {
		this.Bus_id =Bus_id;
		this.capacity = Capacity;
		this.Bus_no=Bus_no;
		this.schedule_id=Schedule_id;
	
	}
	public int getBus_id() {
		return this.Bus_id;
	}

	public void setBus_id(int Bus_id) {
		this.Bus_id = Bus_id;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String Capacity) {
		this.capacity = Capacity;
	}
	
	public String getBus_no() {
		return this.Bus_no;
	}

	public void setBus_no(String Bus_no) {
		this.Bus_no = Bus_no;
	}

	public int getSchedule_id() {
		return this.schedule_id;
	}

	public void setSchedule_id(int Schedule_id) {
		this.schedule_id = Schedule_id;
	}

    

}