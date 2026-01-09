
public enum Direction {
	NORTH(0){int a(){return super.a+10;}} //ordinal:0
	,SOUTH(1) //ordinal:1
	,EAST(2)
	,WEST(3);
	
	private int a;
	private Direction(int a) {this.a=a;}
	int a() {return this.a;}
}
