package loops;

import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k= 0;
		
		for(int i=1;i<=2*n;i++)
		{
			if(i<=n)
			{
				for(int j=1;j<=i-1;j++)
					System.out.print(" ");
				for(int j=1;j<=n-i+1;j++)
					System.out.print("* ");
				
			}
			else
			{
				for(int j=1;j<=2*n-i;j++)
					System.out.print(" ");
				for(int j=1;j<=i-n;j++)
					System.out.print("* ");
			}
				
			System.out.println();
		}
	}

}
