import java.util.Arrays;

public class A {
	int a=10;
	String str="Hello"; //리터럴 방식->String pool 저장
	String str1="Hello"; //String pool 동일값 존재 체크 
	String s=new String("hello");//인스턴스 생성
	void a() {
		str=str+"World!";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.substring(5));
		System.out.println(str.substring(0,4));
		System.out.println(str.indexOf('s'));// 존재 하지 않을경우 -1이 반환된다
		System.out.println(str.substring(str.indexOf('H'),str.indexOf('l')+2));
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.replace('!', '?'));
		str1="Hello|World!";
		String[] arr=str1.split("[|]");
		System.out.println(Arrays.toString(arr));
		System.out.println(str1.join("|", arr));
		System.out.println(str1.contains("O"));
		System.out.println(str1.startsWith("H"));
		System.out.println(str1.endsWith("!"));
		System.out.println(str.toUpperCase());
	}
}
