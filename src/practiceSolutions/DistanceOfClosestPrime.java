package practiceSolutions;

import java.util.*;

public class DistanceOfClosestPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		
		int i=1;
		while(true) {
			if(isPrime(Num-i)||isPrime(Num+i)) {
				System.out.println(i);
				break;
			}i++;
		}

	}
	
	public static boolean isPrime(int n) {
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}return true;
	}

}
