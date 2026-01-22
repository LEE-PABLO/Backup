
public class TicketService {
	int stock;
	TicketService (int stock){this.stock=stock;}
 public synchronized void decrease () {
	 	if(stock>0) {
		stock-=1;
	 	System.out.println(stock);}
	 	else if(stock<=0) throw new InvalidTicketAmountException("티켓이 매진되었습니다");}
 public int getStock() {return stock;}
 }

