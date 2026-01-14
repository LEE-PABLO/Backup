package Answersheet;
import java.util.Scanner;

public class Guest {
     int desiredCount;
     String selectedSeatNum;
     String selectedGrade;

    void tellTicketCount(Scanner sc) {
        System.out.print("예매할 티켓 수를 입력하세요 (최대 3장): ");
        this.desiredCount = sc.nextInt();
    }

    void tellSeatNumber(Scanner sc) {
        System.out.print("원하는 좌석 번호 (A1~M20): ");
        this.selectedSeatNum = sc.next();
    }

    void tellGrade(Scanner sc) {
        System.out.print("원하는 좌석 등급 (Economy, Standard, Prime): ");
        this.selectedGrade = sc.next();
    }

    int getDesiredCount() { return desiredCount; }
    String getSelectedSeatNum() { return selectedSeatNum; }
    String getSelectedGrade() { return selectedGrade; }
}