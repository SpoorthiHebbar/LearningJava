package strings;

public class Anagram2 {

	public static void main(String[] args) {
		String a ="fkj";
		String b ="fgh";
		
		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];
	if(a.length()==b.length()) {
		for(int i=0;i<a.length();i++) {
			char c = a.charAt(i);
			for(int j=0;j<b.length();i++) {
				if(b.charAt(j)==c && !visited[j]) {
					isAnagram = true;
					break;
				}
			}
		}if(isAnagram)
			System.out.println("anagram");
		else
			System.out.println("not");

	}
	}

}
