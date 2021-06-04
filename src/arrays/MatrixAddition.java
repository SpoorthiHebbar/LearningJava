package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int m=sc.nextInt();
		System.out.println("enter the number of columns");
		int n=sc.nextInt();
		
		int matrix1[][]= new int[m][n];
		int matrix2[][]= new int[m][n];
		int sumMatrix[][]= new int[m][n];
		int diffMatrix[][]= new int[m][n];
		int proMatrix[][]= new int[m][n];
		System.out.println("enter matrix one");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				matrix1[i][j]=sc.nextInt();
		}
		
		System.out.println("enter matrix two");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				matrix2[i][j]=sc.nextInt();
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
		}
		
		System.out.println("Sum matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(sumMatrix[i][j]+"\t");
			System.out.println();
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				diffMatrix[i][j]=matrix1[i][j]-matrix2[i][j];
		}
		
		System.out.println("Difference matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(diffMatrix[i][j]+"\t");
			System.out.println();
		}
		
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
					proMatrix[i][j]=matrix1[i][k]*matrix2[k][j];
			}
		}
		
		System.out.println("Product matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(proMatrix[i][j]+"\t");
			System.out.println();
		}
		
	}

}
