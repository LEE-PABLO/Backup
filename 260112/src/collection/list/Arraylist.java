package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import collection.Fruit;

public class Arraylist {
	//List<Fruit> list=new ArrayList<>();
	List<Fruit> a(List<Fruit> list) {
	if(list.isEmpty()) list=new ArrayList<>();
	Iterator<Fruit> ite=list.iterator();
	while(ite.hasNext()) {Fruit f=ite.next();}
	//list.add(10); 
	//list.add("Hello"); list.add(true); 
	list.add(new Fruit("감")); 
	//list.add(true); 
	list.add(new Fruit("감"));
	//boolean flag=(boolean)list.get(2); 
	Fruit f=list.get(0);
	list.remove(1);
	System.out.println();
	return list;}
}
