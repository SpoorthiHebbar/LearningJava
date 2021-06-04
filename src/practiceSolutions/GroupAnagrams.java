package practiceSolutions;
import java.util.*;
public class GroupAnagrams {

	public static void main(String[] args) {
		String[] str = {"ate","dog","eat","tea","god","key"};
		System.out.println(Anagrams(str));
	}

	 public static List<List<String>> Anagrams(String[] string_list) {
	        
	        Map<String,List<String>> map = new HashMap<>();
	        
	        for(String s: string_list){
	            char[] str = s.toCharArray();
	            Arrays.sort(str);
	            String key = new String(str);
	            
	            if(!map.containsKey(key)){
	                map.put(key, new LinkedList<String>());
	            }
	            
	            map.get(key).add(s);
	        }
	        
	        return new LinkedList<>(map.values());
	    }
}
