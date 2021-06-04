package arrays;

import java.util.Scanner;
import java.util.*;

public class MaxFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int max=1,count=1,res=arr[0];
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1])
				count++;
			else if(max<count)
			{
				max=count;
				res=arr[i];
			}
		}
		System.out.println(res);
	}

}
