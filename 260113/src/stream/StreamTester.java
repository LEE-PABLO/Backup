package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTester {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> stream = list.stream();
		
		String[] arr= {"a", "b", "c"};
		Stream<String> stream1 = Arrays.stream(arr);
		Stream<String> stream2 = Stream.of("a", "b", "c");
		
		IntStream intStream = IntStream.range(1, 5);//1,2,3,4
		IntStream intStream1 = IntStream.rangeClosed(1, 5);//1,2,3,4,5
		
		Stream<String> stream3= Stream.<String>builder()
		.add("a")
		.add("b")
		.add("c")
		.build();
		Stream<Integer> infinite=Stream.iterate(0, n->n+2);
		Stream<Double> random=Stream.generate(Math::random);
		
		Stream<String> empty=Stream.empty();
		
		List<Integer> list1=Arrays.asList(-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7);
		List<Integer> list2=list1.stream()
								.filter(x->x>0)//Predicate, 중간연산
								.map(x->x*2)//Function, 중산연산
								.collect(Collectors.toList());//최종연산
		System.out.println(list1.toString());
		System.out.println(list2.toString());
	}

}
