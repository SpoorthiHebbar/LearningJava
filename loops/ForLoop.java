package loops;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		 for(int i=0;i<=n;i+=2)
			 sum+=i;
		System.out.println(sum);	
		
		for(int j=1;j<=10;j++)
			System.out.println(j*n);
		
	}

}
