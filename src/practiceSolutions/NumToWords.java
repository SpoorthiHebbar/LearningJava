package practiceSolutions;

import java.util.Scanner;
import java.lang.Math;

public class NumToWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int d = (int) Math.log10(num)+1; 
		String th = "";
		String h = "";
		String t = "";
		String o = "";
		
		int[] number = new int[d];
		for(int i=0;i<d;i++)
			number[i]=(int) (num%Math.pow(10,i+1))/(int)Math.pow(10,i);
		
		String str[]= {"","one","two","three","four","five","six","seven","eight","nine"};
		String tens[]= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		String lt[]= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		
		if(number[1]>=2)
			t=tens[number[1]];
		if(number[1]==1)
			t=lt[number[1]%10];
		
		if(number[2]>0)
			h=str[number[2]]+" hundred ";
		if(number[3]>0)
			th=str[number[3]]+" thousand ";
//		if(number[4]>0)
//			th=str[number[3]]+" thousand ";
		
		if(number[0]>0)
			o=str[number[0]];
		
		String res = th+h+t+o;
		
		System.out.println(res);
	}

}
