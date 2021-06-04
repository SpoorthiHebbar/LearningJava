package collectionframework;

public class ImplementQueue {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		
		q.enqueue(34);
		q.enqueue(78);
		q.enqueue(44);
		
		System.out.println(q.dequeue()+ " " +q.peek());
		System.out.println(q.dequeue()+ " " +q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		

	}

}
