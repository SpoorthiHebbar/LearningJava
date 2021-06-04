package practiceSolutions;
import java.util.*;

public class MinimumAddition {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int T = sc.nextInt();
		        while(T-- !=0){
		            int n = sc.nextInt();
		            int k = sc.nextInt();
		            int[] a = new int[n];
		            for(int i=0;i<n;i++){
		                a[i] = sc.nextInt();
		            }
		            
		       int res = fun(a,n,k); 
		       System.out.println(res);

		 }	       
	}

	private static int fun(int[] a, int n, int k) {
		int sum = 0,c=1;
		while(true) {
			for(int i=0;i<n;i++) {
				sum+=a[i];
			}
			if((sum/n)<=k)
				return 0;
			else {
				while(true) {
					sum++;
					if((sum/(n+c))<=k) {
						return c;
					}c++;
				}
			}
		}
		
	}
}
