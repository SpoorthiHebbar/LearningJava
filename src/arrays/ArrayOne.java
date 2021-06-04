package arrays;

import java.util.Scanner;

public class ArrayOne {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int marks[] = new int[n];
		double sum =0 ;
		
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(marks[i]+" ");
			sum+=marks[i];
		}
			
		System.out.println();
		System.out.println(sum/n);
		

	}

}
