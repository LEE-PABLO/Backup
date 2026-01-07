package animal;

public class Zoo<T extends Animal> {
	private T t;
	void setT(T t) {this.t=t;}
	T getT() {return this.t;}
}
