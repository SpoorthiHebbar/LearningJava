package strings;

public class Palindrome {

	public static void main(String[] args) {
		String a = "abba";
		String b= "abbab";
		
		boolean isPalindrome = false;
		
		if(a.length()==b.length()) {
			isPalindrome = true;
			int len = a.length();
			for(int i=0;i<len;i++) {
				if(a.charAt(i)!=b.charAt(len-i-1)) {
					isPalindrome = false;
					break;
				}
			}
			
		}if(isPalindrome)
			System.out.println("Palindrome");
		else
			System.out.println("not");					

	}

}
