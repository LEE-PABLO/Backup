package collection.list;

import java.util.LinkedList;

import collection.Fruit;

public class Linkedlist {
	LinkedList list=new LinkedList();
	void a() {list.add(10); list.add("Hello"); list.add(true); 
	list.add(new Fruit("감")); list.add(true); list.add(new Fruit("감"));
	boolean flag=(boolean)list.get(2); Fruit f=(Fruit)list.get(3);
	list.remove(2);
	System.out.println();}
}
