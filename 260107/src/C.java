import java.util.StringTokenizer;

public class C {
	void c() {
		String s="a,b,c,d,e,f";
		StringTokenizer st=new StringTokenizer(s, ",");
		while (st.hasMoreTokens()) {
			String t=st.nextToken();
			System.out.println(t);
		}
	}

}
