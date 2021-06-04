package userInput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class TakeInput {

	public static void main(String[] args) {
		String str[] = {"ate","dog","eat","tea","god","key"};
		System.out.println(group(str));

	}
	
	static List<List<String>> group(String[] str) {
		Map<String,LinkedList<String>> map = new HashMap<>();
		for(String s:str) {
			
			char[] a = s.toCharArray();
			Arrays.sort(a);
			String key = new String(a);
			
			if(!map.containsKey(key)) {
				map.put(key,new LinkedList<String>());
			}
			
			map.get(key).add(s);
		}
		return new LinkedList<>(map.values());
		
	}

}
