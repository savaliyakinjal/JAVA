package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Prec {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		// for add insert list
				
				list.add("C");
				list.add("C++");
				list.add("C++");
				list.add("React");
				list.add("SQL");

				// for add list with index

				list.add(4, "Node");
				System.out.println(list);

//				System.out.println("get value of index no. 2 :" + list.get(2));

				list.set(1, ".net");
				
				list.addFirst("java");
				list.addLast("C#");
//				list.remove(1);
				System.out.println(list);
				list.remove();
				System.out.println(list);
				list.remove("C#");
//				list.removeFirst();
//				list.removeLast();
//				list.removeFirstOccurrence("React");
//				list.removeLastOccurrence("React");
				
				System.out.println("******************************");
//				Iterator itr = list.iterator();
				
				// for descending....
				Iterator itr = list.descendingIterator();
				
				while (itr.hasNext()) {
					System.out.println(itr.next());

				}
	}
}
