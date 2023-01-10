package model;

public class Ticket{
	
	int book_id;
	int ticket_no;
	
	public Ticket() {
	}
	
		
	 public Ticket( int book_id, int ticket_no) {
		
		this.book_id=book_id;
		this.ticket_no=ticket_no;
	 }
	
	 

		public int getBook_id() {
			return this.book_id;
		}

		public void setBook_id(int book_id) {
			this.book_id = book_id;
		}

		public int getTicket_no() {
			return this.ticket_no;
		}

		public void setTicket_no(int ticket_no) {
			this.ticket_no = ticket_no;
		}

	    

	}
	
	
	

	
	

	