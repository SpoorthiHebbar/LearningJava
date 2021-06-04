package whileLoops;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
	
		double sum = 0;
		int noOfDigits = (int) Math.log10(num)+1;
		System.out.println("No of digits ="+ noOfDigits);
		
		while(num>0) {
			sum += num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}
