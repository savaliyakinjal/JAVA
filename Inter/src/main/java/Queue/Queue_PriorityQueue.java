package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		
		queue.add(10);
		queue.add(50);
		queue.add(8);
		queue.add(9);
		queue.add(45);
		queue.add(96);
		
		System.out.println("PriorityQueue : "+queue);
		
		System.out.println(queue.remove());
		System.out.println("PriorityQueue After remove(): "+queue);
		
		System.out.println(queue.poll());
		System.out.println("PriorityQueue After poll(): "+queue);
		
		System.out.println("PriorityQueue  peek(): "+queue.peek());
		System.out.println("PriorityQueue  element(): "+queue.element());
		
		
	}
}
