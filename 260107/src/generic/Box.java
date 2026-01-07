package generic;

public class Box<T extends Fruit> {
	private T t;
	private Apple apple;
	private	Object obj;
	void setT(T t) {
		this.t=t;
	}
	void setObject(Object obj) {
		this.obj=obj;
	}
	Object getObject() {return this.obj;}
	T getT() {return this.t;}
}
