package collectionframework;
 import java.util.*;
import java.util.Collections;

public class MyList {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("jackfruit");
		fruits.add("mamgo");
		fruits.set(1,"peach");
		fruits.remove(2);
		//Object[] x = fruits.toArray();
		//String temp[] = new String[fruits.size()];
		 //fruits.toArray(temp);
		fruits.sort(null);
		
		System.out.println(fruits);
		
		
		ArrayList<Integer> numbers = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			numbers.add(sc.nextInt());
		}
		
		numbers.sort(null);
		for(int a: numbers) {
			System.out.print(a+" ");
		}
	}

}
