package loops;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		
		if(n<2)
			flag = 1 ;
		
		for(int i=2;i<=n/2;i++)
		//for(i<2;i*i<= n;i++)
			{
				if(n%i==0)
				{
					flag= 1;
					break;
				}
				
			}
		if(flag==1)
			System.out.println(" not prime");
		else
			System.out.println(" prime");

	}

}
