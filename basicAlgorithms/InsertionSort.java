package basicAlgorithms;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		
		System.out.println("enter array");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}a[j+1]=key;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}

}
