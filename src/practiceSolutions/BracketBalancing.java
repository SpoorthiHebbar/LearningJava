package practiceSolutions;

import java.util.*;

public class BracketBalancing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		System.out.println(checkbrackets(string));
	}
	
	public static boolean checkbrackets(String str) {
		Stack<Character> stack = new Stack<>();
		char check;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			switch(c) {
			case '[':
			case '(':
			case '{':{stack.push(c);
					 continue;}
			}
			if(stack.empty())
				return false;
			switch(c) {
			case '}':
				check = stack.pop();
				if(check=='['||check=='(')
					return false;
				break;
			
			case ']':
				check = stack.pop();
				if(check=='{'||check=='(')
					return false;
				break;
			
			case ')':
				check = stack.pop();
				if(check=='['||check=='{')
					return false;
				break;
			
			
			}
		}
		return (stack.isEmpty());
	}

}
