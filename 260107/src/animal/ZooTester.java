package animal;

public class ZooTester {

	public static void main(String[] args) {
		Zoo<Animal>[] z=new Zoo[2];
		z[0].setT(new Tiger());
		z[1].setT(new Lion());
		Animal[] arr=new Animal[2];
		arr[0]=z[0].getT();
		arr[1]=z[1].getT();
	}

}
