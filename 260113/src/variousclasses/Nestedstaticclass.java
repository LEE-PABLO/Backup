package variousclasses;

public class Nestedstaticclass {
	static int a=10;
	static class N2{
		N2(){System.out.println(11);}
		void n() {System.out.println(a);}
		static void n2() {System.out.println(a);}
	}
}
