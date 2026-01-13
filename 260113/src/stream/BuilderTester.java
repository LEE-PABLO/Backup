package stream;

public class BuilderTester {

	public static void main(String[] args) {
		A a= new A.Builder()
				.a(10)
				.a2(20)
				.build();
	}

}
