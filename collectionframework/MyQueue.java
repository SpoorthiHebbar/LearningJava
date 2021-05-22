package collectionframework;
import java.util.LinkedList;

import collectionframework.MyLinkedList.Node;

public class MyQueue {
	private Node head,rear;
	
	public void enqueue(int data) {
		
		Node temp = new Node(data);
		if(head==null) {
			head = rear = temp;
		}
		rear.next= temp;
		rear = rear.next;
	}
	
	public int dequeue() {
		if(head==null) {
			return 0;
		}
		if(head.next==null) {
			Node temp = head;
			head = rear =null;
			return temp.data;
		}
		Node temp = head;
		head=head.next;
		return temp.data;
	}
	
	public int peek() {
		if(head == null) {
			return 0;
		}
		return head.data;
	}
}
