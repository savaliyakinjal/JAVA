package Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class T2004_Stream {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(5);
		list.add(85);
		list.add(6);
		list.add(45);
		list.add(75);
		list.add(2);

		List<Integer> list2 = list.stream().filter(e -> e > 50).collect(Collectors.toList());
		System.out.println(list2);

		list.stream().sorted().forEach(System.out::println);

		Integer i = list.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("Min :" + i);
		
		Integer i1 = list.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("Max :" + i1);
		
		
	}
}
