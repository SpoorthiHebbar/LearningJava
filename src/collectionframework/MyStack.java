package collectionframework;

import java.util.LinkedList;

public class MyStack<e> {
	
	LinkedList<e> stack = new LinkedList<>();
	
	public void push(e item) {
		stack.add(item);
	}
	
	public e peek() {
		return stack.get(stack.size()-1);
	}
	
	public void pop() {
		stack.remove(stack.size()-1);
	}
	
	public int search(e item) {
		return stack.indexOf(item);	}
}

