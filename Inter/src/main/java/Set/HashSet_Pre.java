package Set;

import java.util.HashSet;

public class HashSet_Pre {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		
		set.add(10);
		set.add(null);
		set.add(null);
		set.add(20);
		set.add(8);
		set.add(9);
		set.add(74);
		set.add(20);
		set.add(58);
		
		System.out.println("HashSet : "+set);
		
		set.remove(8);
		System.out.println("After remove() :"+set);
		
		System.err.println("isEmpty() :"+set.isEmpty());
		System.err.println("size() :"+set.size());
		
		
		
	}
}
