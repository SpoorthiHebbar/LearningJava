package collectionframework;

public class MyStackImplementation {

	public static void main(String[] args) {
		
		MyStack<Integer> s = new MyStack<>();
		
		s.push(23);
		s.push(34);
		s.push(56);
		
		System.out.println(s.search(34));

	}

}
