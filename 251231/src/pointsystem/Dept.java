package pointsystem;

public class Dept {
	Money m=new Money();
	void sell(Card c) {
		c.payment(m);
		
	}
}
