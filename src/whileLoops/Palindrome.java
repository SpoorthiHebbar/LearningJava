package whileLoops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int number=num;
		int rev = 0;
		
		while(num>0)
		{
			int temp = num%10;
			rev = rev*10 + temp;
			num/=10;
		}
		System.out.println(rev);
		if(rev==number)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
