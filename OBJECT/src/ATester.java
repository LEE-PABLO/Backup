import java.lang.reflect.Method;

public class ATester {

	public static void main(String[] args) {
		A a3=new A();
		Class c=a3.getClass();
		Method[] m=c.getDeclaredMethods();
		System.out.println();
		
		A a=new A();
		System.out.println(a.hashCode());
		System.out.println(System.identityHashCode(a));
		A a2=new A();
		System.out.println(a2.hashCode());
		System.out.println(System.identityHashCode(a2));
		boolean flag = a.equals(a2);
		System.out.println(flag);
	}

}
