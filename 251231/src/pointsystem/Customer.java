package pointsystem;

public class Customer {
	Card c=new Card();
	Point p=new Point();
	Money m=new Money();
   void buy(Dept d) {
	   c.payment(m);
	   d.sell(c);
	   p.getPoint();
   }
}
