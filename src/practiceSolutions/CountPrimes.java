package practiceSolutions;

public class CountPrimes {

	public static void main(String[] args) {
		
		System.out.println("\n" + countPrime(1,6));

	}
	
	public static int countPrime(int a,int b) {
		int c=0;
		for(int i=a+1;i<b;i++) 
			if(isPrime(i)) {
				System.out.print(i+" ");
				c++;
			}
					
		return c;
	}
		
	public static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}return true;
	}

}
