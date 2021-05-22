package loops;
import java.util.Scanner;

public class RaisePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res =1;
		
		for(int i=0;i<b;i++)
			res *=a;
		System.out.println(res);
		
	}

}
