package exception;

public class Tester {

	public static void main(String[] args) {
		try {new Arithmetic().a();}
		catch (SamsungException e) {e.printStackTrace();}
		System.out.println("실행종료");
	}

}
