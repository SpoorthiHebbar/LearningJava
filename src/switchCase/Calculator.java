package switchCase;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		
		System.out.println("enter operator");
		String str = sc.nextLine();
		char op = sc.nextLine().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		default:
			System.out.println("invalid operation");
		}
		

	}

}
