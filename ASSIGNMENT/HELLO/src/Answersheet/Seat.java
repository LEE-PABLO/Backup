package Answersheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seat {
     String seatNumber;
     String grade;

    private static final List<String> SEAT_POOL = new ArrayList<>();
    private static final List<String> GRADE_POOL = Arrays.asList("Economy", "Standard", "Prime");

    static {
        for (char row = 'A'; row <= 'M'; row++) {
            for (int col = 1; col <= 20; col++) {
                SEAT_POOL.add(row + String.valueOf(col));
            }
        }
    }

    private Seat(String seatNumber, String grade) {
        this.seatNumber = seatNumber;
        this.grade = grade;
    }

    public static boolean isValidSeatNumber(String seatNum) {
        return SEAT_POOL.contains(seatNum.toUpperCase());
    }

    public static boolean isValidGrade(String grade) {
        for (String g : GRADE_POOL) {
            if (g.equalsIgnoreCase(grade)) return true;
        }
        return false;
    }

    public static Seat createSeat(String seatNumber, String grade) {
        return new Seat(seatNumber.toUpperCase(), grade);
    }
}