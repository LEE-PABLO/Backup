package variousclasses;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Tester {

	public static void main(String[] args) {
		new Nestedstaticclass.N2().n();
		Nestedstaticclass.N2.n2();
		new Nestedclass().new N().n();
		new Localclass().l();
		new Anonymousclass().a();
		//Functional Interface(P, F, C, S)
		Predicate<Integer> p=x->x>0;
		System.out.println(p.test(5));
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("Hello"));
		Consumer<String> printer =s->System.out.println(s);
		printer.accept("Hello World!");
		Supplier<Double> randomValue=()->Math.random();
		System.out.println(randomValue.get());
		//Method Reference
		Function<String, Integer> f1=s->Integer.parseInt(s);
		//==
		Function<String, Integer> f2=Integer::parseInt;
		
		
	}
}
