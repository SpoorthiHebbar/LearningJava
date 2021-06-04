package collectionframework;


public class MergeListsWithHead {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	Node head;
	public MergeListsWithHead() {
		head = null;
	}
	public Node add(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
		
		return head;
	}
	
	public static void printll(Node head) {
		if(head==null)return;
		Node temp=head;
		while(temp.next!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
	
	public static Node mergellwithhead(Node head1,Node head2) {
		MergeListsWithHead ll3 = new MergeListsWithHead();
		
		while(head1!=null&&head2!=null) {
			if(head1.data<=head2.data) {
				ll3.add(head1.data);
				head1=head1.next;
			}else {
				ll3.add(head2.data);
				head2=head2.next;
			}
		}
		while(head1!=null) {
			ll3.add(head1.data);
			head1=head1.next;
		}
		while(head2!=null) {
			ll3.add(head2.data);
			head2=head2.next;
		}
		
		return ll3.head;
	}
	
	public static void main(String[] args) {
		
		MergeListsWithHead ll1 = new MergeListsWithHead();
		MergeListsWithHead ll2 = new MergeListsWithHead();
		ll1.add(67);
		ll1.add(66);
		ll1.add(54);
		
		ll2.add(23);
		ll2.add(19);
		ll2.add(12);
		ll2.add(3);
		ll2.add(1);
		
		printll(ll1.head);
		System.out.println();
		printll(ll2.head);
		
		ll1.head = mergellwithhead(ll1.head,ll2.head);
		System.out.println();
		printll(ll1.head);

	}
}


