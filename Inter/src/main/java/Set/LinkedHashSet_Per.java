package Set;

import java.util.LinkedHashSet;

public class LinkedHashSet_Per {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> hashSet=new LinkedHashSet<>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(8);
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add(9);
		hashSet.add(74);
		hashSet.add(20);
		hashSet.add(58);
		
		System.out.println("LinkedHashSet : "+hashSet);
		
		hashSet.remove(8);
		System.out.println("After remove() :"+hashSet);
		
		System.err.println("isEmpty() :"+hashSet.isEmpty());
		System.err.println("size() :"+hashSet.size());
	}
}
