package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tester {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		A a=new A();
		Method[] arr=a.getClass().getDeclaredMethods();
		Hello h=arr[0].getAnnotation(Hello.class);
		System.out.println(h.message());
		String s=h.message();
		arr[0].invoke(a, s);
	}

}
