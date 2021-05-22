package collectionframework;

import java.util.Stack;

public class StackImplementation {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(23);
		stack.push(24);
		stack.push(25);
		stack.push(26);
		
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		System.out.println(stack.search(24)+" "+stack.peek());

	}

}
