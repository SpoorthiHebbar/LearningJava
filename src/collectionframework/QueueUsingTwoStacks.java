package collectionframework;
import java.util.*;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Stack<Integer> ins = new Stack<>();
		Stack<Integer> del = new Stack<>();
		
		int q = sc.nextInt();
		while(q-- > 0) {
			int type = sc.nextInt();
			if(type==1) {
				int x = sc.nextInt();
				ins.push(x);
			}
			else if(type == 2) {
				if(del.isEmpty()) {
					while(!(ins.isEmpty())) {
						del.push(ins.pop());
					}
				}del.pop();
			}
			else {
				if(del.isEmpty()) {
				while(!(ins.isEmpty())) {
					del.push(ins.pop());
				}
			}System.out.println(del.peek());
				}
		}

	}

}
