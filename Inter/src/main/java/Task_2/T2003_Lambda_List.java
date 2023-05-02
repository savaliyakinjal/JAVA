package Task_2;

import java.util.ArrayList;
import java.util.List;

public class T2003_Lambda_List {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(80);
		list.add(82);
		list.add(5);

//	for (Integer integer : list) {
//		System.out.println(integer);
//	}

		list.forEach((n) -> System.out.println(n));
	}
}
