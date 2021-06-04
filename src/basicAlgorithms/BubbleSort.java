package basicAlgorithms;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		System.out.println("Enter array elements");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
				if(a[j]>a[j+1])
				{
					int t = a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
		
		System.out.println("sorted");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	
			
		

	}

}
