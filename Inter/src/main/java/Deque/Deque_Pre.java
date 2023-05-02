package Deque;

import java.util.ArrayDeque;

public class Deque_Pre {

	
	public static void main(String[] args) {
		ArrayDeque<Integer> aDeque =new ArrayDeque<>();
		
		aDeque.add(10);
		aDeque.add(50);
		aDeque.add(7);
		aDeque.add(87);
		aDeque.add(96);
		aDeque.add(8);
		System.out.println("ArrayDeque : "+aDeque);
		System.out.println(aDeque.remove());
		System.out.println("ArrayDeque After remove(): "+aDeque);
		
		System.out.println(aDeque.poll());
		System.out.println("ArrayDeque After poll(): "+aDeque);
		
		System.out.println(aDeque.pollLast());
		System.out.println("ArrayDeque After pollLast(): "+aDeque);
		
		System.out.println(aDeque.offerFirst(1));
		System.out.println("ArrayDeque After offerFirst(): "+aDeque);
		
		System.out.println(aDeque.offerLast(100));
		System.out.println("ArrayDeque After offerLast(): "+aDeque);
		
		System.out.println("ArrayDeque After peekFirst(): "+aDeque.peekFirst());
		
		System.out.println("ArrayDeque After peekLast(): "+aDeque.peekLast());
		
	}
}
