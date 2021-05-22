package practiceSolutions;

import java.util.*;

public class Extra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i=0;i<Math.log10(n);i++) {
			num.add((int)(n%(Math.pow(10, i+1)))/(int)(Math.pow(10,i)));
		}
		
		System.out.println(num);

	}

}
