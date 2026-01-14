package Prac;

public class Ticket {
	Seat seat=new Seat();
	int uniqueTicketNumber;
	
	void seatassignment(int a, int b) {
		seat.seatNumber=a;
		seat.seatGrade=seat.seatGradeSet[b-1];
	}

}
