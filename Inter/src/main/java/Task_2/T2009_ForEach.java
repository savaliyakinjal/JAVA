package Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class T2009_ForEach {
	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(85);
		list.add(41);
		list.add(25);
		list.add(5);
		
		System.out.println(list);
		
		System.out.println("******************************");
		list.forEach(num->System.out.println(num));
		
		
		System.out.println("******************************");
		list.forEach(System.out::println);
		
		
		System.out.println("******************************");
		list.forEach(num->{
			System.out.println(num);
		});
		
		
		System.out.println("******************************");
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer num) {
				System.out.println(num);
			}
		});
		
		System.out.println("******************************");
		list.stream().forEachOrdered(num1->System.out.println(num1));
		
	}
}
