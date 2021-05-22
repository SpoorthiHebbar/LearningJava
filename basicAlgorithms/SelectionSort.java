package basicAlgorithms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter array");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		for(int i=0;i<n-1;i++)
		{int min = i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp = a[i];
			a[i]=a[min];
			a[min]=temp;
				
		}
		System.out.println("sorted array");
		for(int i = 0;i <n;i++)
			System.out.print(a[i]+" ");

	}

}
