package practiceSolutions;
import java.util.*;

public class TwinPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		
		System.out.println(isPrime(9));
		
		for(int i=a+1;i<=b-3;i++) {
			if((isPrime(i)==true) && (isPrime(i+2)==true))
			System.out.println(i+ " " + (i+2) );
	}
//		for(int i=a+1;i<b;i++) {
//			if(isPrime(i)) {
//				sum+=i;
//			}
//		}if(isPrime(sum))
//			System.out.println(sum + " Prime");
//		else
//			System.out.println(sum + " not Prime");
	}
	
	public static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}return true;
	}
}
