package loops;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,b=1;
		int fib;
		
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n-2;i++)
		{
			fib = a+b;
			System.out.println(fib);
			a=b;
			b=fib;
		}
	}

}
