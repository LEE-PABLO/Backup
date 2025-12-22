
public class Starbucks {
	private Coffee[] coffees;
	private void makeCoffee(int size) {
		coffees=new Coffee[size];
		for(int i=0;i<size;i++) {
			Coffee coffee=new Coffee();
			coffee.setName("아이스 아메리카노" + i);
			coffee.setPrice(3500);
			coffees[i] =coffee;
			
		}
	}
	public Coffee[] getCoffees(int size) {
		if (null==coffees) {
			makeCoffee(size);
		}
		return this.coffees;}
}