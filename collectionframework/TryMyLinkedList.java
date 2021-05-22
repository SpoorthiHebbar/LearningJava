package collectionframework;

public class TryMyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyLinkedList ll = new MyLinkedList();
			ll.add(23);
			ll.add(3);
			ll.add(14);
			ll.add(10);
			ll.add(199);
			
			ll.print();
			System.out.println(ll.size());
			
			ll.removeByKey(3);
			
			ll.print();
			System.out.println(ll.size());
			
			ll.removeByPos(0);
			ll.print();
	}
	
}
