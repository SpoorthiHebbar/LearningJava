package loops;
import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double res1=0;
		double res2=0;
		 for(double i=1;i<=n;i+=2)
			 res1+=1/i;
		 for(double j=2;j<=n;j+=2)
			 res2+=1/j;
		 double res = res1-res2;
		 
		 System.out.println(res);
		 
//		 for(double i=1;i<=n;i++)
//			 if(i%2==0)
//				 res-=1/i;
//			 else
//				 res+=1/i;
		   
		
	}

}
