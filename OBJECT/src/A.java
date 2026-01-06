
public class A extends Object{
	int a=10;
	void a () {a2();}
	void a2() {}
	public int hashCode() {
		return 10;
	}
	public boolean equals(Object obj) {
		return (this.hashCode()==obj.hashCode());
	}
}
