package practiceSolutions;

import java.util.*;

public class HighestFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		
		int count=1,maximum=1,res = a[0];
		Arrays.parallelSort(a);
		
		for(int i=1;i<n;i++) {
			if(a[i]==a[i-1]) {
				count++;
			}
			else {
				if(maximum<count) {
					res = a[i-1];
					maximum=count;
				}
				count=1;
			}
		}
		
		if(maximum<count) {
			res = a[n-1];
			maximum = count;
		}	

		System.out.println(res);
	}

}
