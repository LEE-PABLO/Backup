package exception;

public class Arithmetic {
	void a() throws SamsungException {
		try {int a=10/0;}
		catch(ArithmeticException | NullPointerException n) {System.out.println("¡¡¡¡0으로 나눌 수 없습니다!!!!");
		throw new SamsungException("갤럭시 예외 발생");}
		catch(Exception n) {System.out.println("¡¡¡¡예외가 발생 했습니다!!!!");}
		finally {//마지막으로 반드시 실행해야할 코드 e.g)close()}}
	}
}      void a2() throws ArithmeticException {int a=10/0;}
}