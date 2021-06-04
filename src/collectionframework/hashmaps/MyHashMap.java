package collectionframework.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		Map<String,Integer> num = new HashMap<>();
		
		num.put("One",1);
		num.put("Two",2);
		num.put("Three",9);
		num.put("Four",4);
		
		for(String s:num.keySet()) {
			System.out.println(getHash(s)%num.size());
		}

	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i=0;i<s.length();i++) {
			hash+= s.charAt(i);
		}
		return hash;
	}
}
