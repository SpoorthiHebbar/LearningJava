package collectionframework.hashmaps;
import java.util.*;
import java.util.Map.Entry;


public class HashMapsPractice {

	public static void main(String[] args) {
		Map<String,Integer> num = new HashMap<>();
		
		num.put("One",1);
		num.put("Two",2);
		num.put("Three",9);
		num.put("Four",4);
		
		System.out.println(num);
		
		num.replace("Two",3,2);
		System.out.println(num);
		num.remove("Three", 3);
		System.out.println(num);
		num.replace("Three",3);
		System.out.println(num);
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num.containsKey("One"));
		
		for(String key: num.keySet()) {
			System.out.println(num.get(key));
		}
		
	}

}
