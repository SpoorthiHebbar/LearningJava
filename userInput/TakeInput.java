package userInput;
import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpleInterest = principal*time*rate/100.0f;
		System.out.println("Interest is:" + simpleInterest);

	}

}
