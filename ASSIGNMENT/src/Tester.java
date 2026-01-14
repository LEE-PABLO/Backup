import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guest guest = new Guest();
        CGV cgv = new CGV();

        List<Ticket> myTickets = cgv.startReservation(guest, sc);

        System.out.println("Debug point: Reservation count = " + myTickets.size()); 
        
        sc.close();
    }
}