package recursion;

public class Powerfunc {

	public static void main(String[] args) {
		int x = power(3,6667);
		System.out.println(x);
	}

	private static int power(int a, int b) {
		if(b==0) {
			return 1;
		}
		if(b%2 == 0) {
			return power(a*a,b/2);
		}
		
		return a*power(a,b-1);
	}
	
}
