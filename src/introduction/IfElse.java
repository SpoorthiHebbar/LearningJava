package introduction;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfPetals = sc.nextInt();
		if(noOfPetals % 2 == 1)
			System.out.println("Oops! die alone");
		else
			System.out.println("Congratulations");
		
		if(noOfPetals<=10 && noOfPetals>=2)
			System.out.println("less than 10");
		else if(noOfPetals<=20 && noOfPetals>=10)
			System.out.println("between 10 and 20");
		else
			System.out.println("greater than 20");
			

	}

}
