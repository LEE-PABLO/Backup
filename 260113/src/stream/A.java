package stream;

public class A {
	int a;
	int a2;
	A(Builder b){this.a=b.a; this.a2=b.a2;}

	public static class Builder{
		int a; 
		int a2;
		Builder a(int a){this.a=a; return this;}
		Builder a2(int a){this.a2=a; return this;}
		public A build() {return new A(this);}
		}
	}