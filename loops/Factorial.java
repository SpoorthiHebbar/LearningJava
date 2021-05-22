package loops;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n;i>0;i--)
			fact= fact*i;
		System.out.println(fact);
		
		
	}

}
