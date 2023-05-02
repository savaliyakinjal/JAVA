package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Prec {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		// for add insert list
		list.add("java");
		list.add("java");
		list.add("C");
		list.add("C++");
		list.add("React");
		list.add("SQL");

		System.out.println(list);
		// for add list with index

		list.add(5, "Node");

		System.out.println("get value of index no. 2 :" + list.get(2));

		list.set(1, ".net");

		System.out.println("Sorted list :");
		Collections.sort(list);

		System.out.println("******************************");
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String string = list1.previous();
			System.out.println(string);

		}

		// for list remove
//		list.remove(5);
		list.remove(".net");
		

		System.out.println("******************************");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		

	}
}
