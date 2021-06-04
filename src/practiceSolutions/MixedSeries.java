package practiceSolutions;

import java.util.Scanner;

public class MixedSeries {

	public static void main(String[] args) {
		// 4 8 7 16 10 32....
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==1) {
			System.out.println((5+3*n)/2);
		}else {
			System.out.println(4*Math.pow(2, n/2));
		}	

	}

}
