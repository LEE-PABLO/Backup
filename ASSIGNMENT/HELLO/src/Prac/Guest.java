package Prac;

public class Guest {
		int howManyTicketWanted;
		int seatNumberWanted;
		int seatGradeWanted;
		Ticket ticket;
		void receiveticket(CGV cgv) {
			ticket=cgv.ticketissue();
		}
}
