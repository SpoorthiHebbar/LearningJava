package collectionframework;

public class MyLinkedList {

	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	Node head;
	int size;
	
	void add(int item) {
		Node toAdd = new Node(item);
		Node temp = head;
		if(head==null) {
			head = toAdd;
			size++;
			return;
		}
		while(temp.next!=null) {
			temp = temp.next;
		}temp.next = toAdd;
		size++;
	}
	
	void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	int size() {
		return size;
	}
	
	void removeByKey(int data) {
		Node prev = null;
		if(head == null) {
			System.out.println("empty list");
			return;
		}
		if(head.data == data) {
			head = head.next;
			size--;
		}
		
		Node cur = head;
		while(cur!=null && cur.data!=data) {
			prev = cur;
			cur = cur.next;
		}if(cur!=null) {
			prev.next = cur.next;
			size--;
		}
		
	}
	
	void removeLast() {
		if(head == null) {
			System.out.println("empty list");
		}if(head.next == null) {
			head= null;
		}
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}temp.next = null;
	}
	
	void removeByPos(int pos) {
		
		if(head == null) {
			System.out.println("empty list");
			return;
		}
		if(pos==0) {
			head = head.next;
			size--;
			return;
		}
		if(head.next==null && pos == 0) {
			head=null;
			return;
		}
		else if(pos == size-1) {
			removeLast();
			size--;
		}else {
		Node cur = head;
		Node prev = null;
		for(int i=0;i<pos;i++) {
			prev = cur;
			cur = cur.next;
		}if(cur.next!=null) {
			prev.next = cur.next;
			size--;
		}
		}
	}

}
