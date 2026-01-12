package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import collection.Fruit;

public class Hashset {
	Set<Fruit> set=new HashSet<>();
	void a() { 
	Fruit f1=new Fruit("사과");
	System.out.println(f1.hashCode());
	set.add(f1);
	Fruit f2=new Fruit("배");
	System.out.println(f2.hashCode());
	set.add(f2);
	Fruit f3=new Fruit("감");
	System.out.println(f3.hashCode());
	set.add(f3);
	
	set.forEach(System.out::println);//람다식
	
	Iterator<Fruit> ite=set.iterator();
	while(ite.hasNext()) {Fruit f=ite.next();} 
	//ite.remove();}
	}
}