package arrays;

import java.util.Scanner;

public class ArrayTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[] = new int[n];
//		
//		for(int i=0;i<n;i++)
//			arr[i]=sc.nextInt();
		
		int array[] = {12,14,15,11,16,19};
		int  count=0;
		
		for(int i:array)
		{
			count++;
		}
		System.out.println(count);
	}

}
