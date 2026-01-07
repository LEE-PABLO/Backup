
public class B {
	StringBuilder sb=new StringBuilder();//Available in single-thread 
	void b() {
		sb.append("Hello");
		for (int i=1;i<=100;i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
	}
	void b2() {
		StringBuffer sb2=new StringBuffer();//synchronized, Thread-Safe in multi-thread environment 
		sb2.append("Hello");
		for (int i=1;i<=100;i++) {
			sb2.append(i);
		}
		System.out.println(sb.toString());
	}
}
