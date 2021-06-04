package arrays;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int m=sc.nextInt();
		System.out.println("enter the number of columns");
		int n=sc.nextInt();
		
		int matrix[][]= new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				matrix[i][j]=sc.nextInt();
		}
		
		
		for(int i=0;i<m;i++)
		{
			int sum=0,j;
			for(j=0;j<n;j++)
				{
					System.out.print(matrix[i][j]+" ");
					sum+=matrix[i][j];
				}
			
			System.out.println("="+sum);
			System.out.println();
		}

	}

}
