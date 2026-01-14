import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CGV {
    public List<Ticket> startReservation(Guest guest, Scanner sc) {
        while (true) {
            guest.tellTicketCount(sc);
            if (guest.getDesiredCount() > 0 && guest.getDesiredCount() <= 3) {
                break;
            }
            System.out.println("예매 가능 좌석수를 초과하였습니다. 다시 입력해주세요.");
        }

        List<Ticket> finalTickets = new ArrayList<>();

        for (int i = 0; i < guest.getDesiredCount(); i++) {
            System.out.println("\n[" + (i + 1) + "번째 좌석 예약]");

            while (true) {
                guest.tellSeatNumber(sc);
                if (Seat.isValidSeatNumber(guest.getSelectedSeatNum())) {
                    break;
                }
                System.out.println("!! 존재하지 않는 좌석 번호입니다. 다시 입력하세요.");
            }

            while (true) {
                guest.tellGrade(sc);
                if (Seat.isValidGrade(guest.getSelectedGrade())) {
                    break;
                }
                System.out.println("!! 잘못된 등급입니다. (Economy, Standard, Prime)");
            }

            Seat validatedSeat = Seat.createSeat(guest.getSelectedSeatNum(), guest.getSelectedGrade());
            Ticket ticket = new Ticket(validatedSeat);
            finalTickets.add(ticket);
        }

        return finalTickets;
    }
}