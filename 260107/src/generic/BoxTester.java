package generic;

public class BoxTester {

	public static void main(String[] args) {
		Box<Apple> box3=new Box<Apple>();
		box3.setT(new Apple());
		Apple apple3=box3.getT();
		
		Box box=new Box();
		//box.setT(new Apple());
		//Apple apple=box.getT();
		
		Box box2=new Box();
		box2.setObject(new Apple());
		Apple apple2=(Apple)box2.getObject();
	}

}
