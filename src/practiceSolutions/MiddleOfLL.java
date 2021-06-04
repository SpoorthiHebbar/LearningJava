package practiceSolutions;

import java.util.*;

public class MiddleOfLL {

	static Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void add(int data) {
		Node temp = new Node(data);
		
		temp.next = head;
		head = temp;
	}
	
	public void mid() {
		Node ptr1 = head,ptr2 =head;
		
		while(ptr2!=null && ptr2.next!=null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
		}System.out.println(ptr1.data);
		
	}
	

public static void main(String args[]) {
	MiddleOfLL m = new MiddleOfLL();
	m.add(23);
	m.add(78);
	m.add(20);
	m.add(79);
	m.add(24);
	m.add(71);
	m.add(77);
	
	m.mid();
	
}

}
