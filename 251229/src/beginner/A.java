package beginner;

/**
 * 초급	if,for,while,break,continue
 */
public class A {
	int sum=0;
	int a=1;
	int b=11;
	void a() {
		for(int i=1;i<=10;i++) {
			if(1==i%2) continue;
			sum+=i;
		}
	}
	void a2() {
		while(true) {
			a++;
			if(1==a%2) continue;
			sum+=a;
			if(10<=a) break;
		}
	}
	void a3() {
		for(int i=10;1<=i;i--) {
			System.out.println(i);
			}
	}
	void a4() {
		while(true) {
			b--;
			if(b<=0)break;
			System.out.println(b);
		}
	}
}
