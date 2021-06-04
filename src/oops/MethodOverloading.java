package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(maxOf(5,9));
		System.out.println(maxOf(13,2,7));

	}
	static int maxOf(int a,int b) {
		if(a<b)
			return b;
		else
			return a;
		
	}
	static int maxOf(int a,int b,int c) {
		return maxOf(maxOf(a,b),c);
	}
}
