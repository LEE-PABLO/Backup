package thr;

public class A {
	void a() {
	try {new B().b();}
	catch (Exception e){
		e.printStackTrace();
		System.out.println("예외가 발생 했습니다");}
	}
}