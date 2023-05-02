package List;

import java.util.Stack;

public class Stack_Prec {
	public static void main(String[] args) {

		Stack<Integer> stack=new Stack<>();
		stack.push(2);
		stack.push(10);
		stack.push(10);
		stack.push(3);
		stack.push(5);
		stack.push(80);
		
		System.out.println("Stack : "+stack);
		System.out.println("Stack isEmpty : "+stack.isEmpty());
		System.out.println("Stack peek : "+stack.peek());
		System.out.println("Stack search : "+stack.search(10));
	}
}
