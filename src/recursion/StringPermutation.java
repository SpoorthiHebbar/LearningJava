package recursion;

import java.util.LinkedList;
import java.util.List;

public class StringPermutation {

	public static void main(String[] args) {
		String str = "abc";
		Anagram(str,0,str.length()-1);

	}
	
	public static void Anagram(String s,int start,int end) {
		if(start==end)
			System.out.println(s);
		if(s==null)
			return;
		for(int i=start;i<=end;i++) {
			s = swap(s,start,i);
			Anagram(s,start+1,end);
			s = swap(s,start,i);
		}	
		
	}
	public static String swap(String s,int i,int j) {
		char[] c = s.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j] = temp;
		
		return String.valueOf(c);
	}
}
