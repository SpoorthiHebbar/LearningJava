package basicAlgorithms;
import java.util.Arrays;
import java.util.Scanner;

public class TwoPointerAlgorithm {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int x = 0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
//		if(twopointfunc(a,0,x)==1) {
//			System.out.println("pair found");
//		}else
//			System.out.println("no pair found");	
		
		for(int i=0;i<n-1;i++) {
			if(twopointfunc(a,i+1,a[i])==1) 
				{System.out.println("triplet found");
				break;}
			System.out.println(" no triplet found");
		}
	}
	
	static int twopointfunc(int[] a,int i, int x) {
		
		int j=a.length-1;
		
		while(i<j) {
			if(a[i]+a[j]==-x)
				return 1;
			else if(a[i]+a[j]>-x)
				j--;
			else
				i++;
		}return 0;
	}

}
