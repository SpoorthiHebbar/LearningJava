package practiceSolutions;

import java.util.Scanner;

public class MixedSeries2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==1)
		System.out.println(fib((n+1)/2));
		else
		System.out.println(findPrime(n/2));
	}

	public static int fib(int n) {
		if(n==0||n==1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	
	public static int findPrime(int n) {
		int c=0,num=1,i;
		while(c<n) {
			num++;
			for(i=2;i<=num;i++) {
				if((num%i)==0)
					break;
				
			}if(num==i)
				c++;
				
	}return num;
	}

}
