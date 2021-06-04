package practiceSolutions;

public class GenerateAnagrams {

	public static void main(String[] args) {
		String str = "abbc";
		anagram(str,0,str.length()-1);
	}
	static void anagram(String str,int start,int end) {
		if(start==end) {
			System.out.println(str);
		}
		
		for(int i=start;i<=end;i++) {
			str = swap(str,start,i);
			anagram(str,start+1,end);
			str = swap(str,start,i);
		}
	}
	
	static String swap(String str,int i,int j) {
		char[] s = str.toCharArray();
		char temp;
		temp = s[i];
		s[i]=s[j];
		s[j]=temp;
		
		return String.valueOf(s);
	}
}
