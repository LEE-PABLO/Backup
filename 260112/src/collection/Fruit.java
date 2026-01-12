package collection;

import java.util.Objects;

public class Fruit {
	String name;
	public Fruit(String s) {this.name=s;}
	public String getName() {return this.name;}
	@Override
	public int hashCode() {
		return Objects.hash(this.name);
	}
	@Override
	public boolean equals(Object obj) {
	return this.name==((Fruit)obj).name;}
	@Override
	public String toString() {
		return this.name;
	}
	//@Override
	//public int compareTo(Fruit f) {
	//return this.name.compareTo(f.name);}
	
	}

