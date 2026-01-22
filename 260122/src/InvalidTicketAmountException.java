
public class InvalidTicketAmountException extends RuntimeException{
	public InvalidTicketAmountException(String message) {
        super(message); // 부모 클래스(RuntimeException)에 메시지 전달
    }
}

