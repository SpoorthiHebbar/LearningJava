package loops;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
				System.out.print(" ");
			System.out.print("*");
		}
	}

}
