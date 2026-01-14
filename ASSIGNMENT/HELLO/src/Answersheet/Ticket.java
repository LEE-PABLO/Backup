package Answersheet;

import java.util.UUID;

public class Ticket {
     String ticketId;
     Seat seat;

    public Ticket(Seat seat) {
        this.ticketId = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.seat = seat;
    }
}