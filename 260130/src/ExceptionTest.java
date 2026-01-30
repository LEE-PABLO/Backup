import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Account account = new Account((int)Math.round(Math.random()*1000000));
		Scanner sc=new Scanner(System.in);	
		while(true) {
        try {System.out.print("인출하실 금액을 입력해 주십시오: ");
    		int input = sc.nextInt();
    		System.out.println();
            account.withdraw(input); // 5만원 출금 시도 -> 예외 발생!
            } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            break;
        }
        
        
		}
		System.out.println("프로그램 종료");
	}
}