package Set;

import java.util.TreeSet;

public class TreeSet_Pre {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();

		set.add(10);
		set.add(20);
		set.add(8);
		set.add(9);
		set.add(74);
		set.add(20);
		set.add(58);

		System.out.println("TreeeSet : " + set);
		System.out.println("Lowest Value: " + set.pollFirst());
		System.out.println("Highest Value: " + set.pollLast());
		System.out.println("TreeeSet : " + set);
		System.out.println("Reverse Set: " + set.descendingSet());
		System.out.println("Head Set: " + set.headSet(9));
		System.out.println("SubSet: " + set.subSet(8,20));
		System.out.println("TailSet: " + set.tailSet(20));
		System.out.println(set.floor(20));
		System.out.println(set.ceiling(2));
		
	}
}
