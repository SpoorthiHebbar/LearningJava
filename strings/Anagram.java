package strings;

public class Anagram {

	public static void main(String[] args) {
		String a = "abj";
		String b = "jbaa";
		int arr[]=new int[256];
		
		boolean isAnagram = true;
		
		for(char c: a.toCharArray()) {
			int index = (int)c;
			arr[index]++;
		}
		for(char c: b.toCharArray()) {
			int index = (int)c;
			arr[index]--;
		}
		
		for(int i=0;i<256;i++)
		{
			if(arr[i]!=0)
			{
				isAnagram = false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}

	}

	
}
