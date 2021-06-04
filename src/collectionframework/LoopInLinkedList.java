package collectionframework;
import java.util.*;

public class LoopInLinkedList {
	static Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next= null;
		}
	}
		
		public void add(int data) {
			Node newnode = new Node(data);
			newnode.next = head;
			head = newnode;
		}
		
		public static boolean identifyLoop(Node head) {
			HashSet<Node> set = new HashSet<>();
			while(head!=null) {
				if(set.contains(head))
					return true;
				set.add(head);
				head= head.next;
			}
			return false;
		}
	
	
	public static void main(String[] args) {
		LoopInLinkedList ll = new LoopInLinkedList();
		ll.add(23);
		ll.add(67);
		ll.add(89);
		ll.add(90);
		
		//ll.head.next.next.next.next = ll.head.next.next;
		System.out.println(identifyLoop(ll.head));
	}

}
