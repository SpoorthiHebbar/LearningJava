package strings;
import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a=a.trim();
		String ans = new String();
		
		String[] arr = a.split("\\s+");
		int len = arr.length;
		
		for(int i=len-1;i>=0;i--) {
			if(ans.isEmpty()) {
				ans+=arr[i];
			}else
				ans+=" "+arr[i];
		}
//		for(int i=a.length()-1;i>=0;i--)
//			System.out.print(a.charAt(i));
		System.out.println(ans);

	}

}
