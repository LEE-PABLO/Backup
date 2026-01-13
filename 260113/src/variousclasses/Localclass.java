package variousclasses;

public class Localclass {
	void l() {
		int a=10;
		class L2{
			void l2() {System.out.println(a);}
		} new L2().l2();
	}
}
