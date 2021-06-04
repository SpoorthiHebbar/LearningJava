package recursion;

public class SumOfFirstN {

	public static void main(String[] args) {
		System.out.println(sum(10));

	}
	
	static long sum(int n) {
		if(n<0) {
			System.out.println("error");
		}
		if(n==0||n==1) {
			return n;
		}
		return n+sum(n-1);
	}

}
