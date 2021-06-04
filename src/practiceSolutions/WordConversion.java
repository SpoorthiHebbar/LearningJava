package practiceSolutions;
import java.lang.Math;

public class WordConversion {

	public static void main(String[] args) {
		int n=3010;
		
		String str[]= {"","one","two","three","four","five","six","seven","eight","nine"};
		String tens[]= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		String lt[]= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		int th = n/1000;
		int h = (n%1000)/100;
		int t = (n%100)/10;
		int o = (n%10);
		String thousands = "";
		String hundreds ="";
		String ten = "";
		String ones ="";
		
		if(th>=1&&th<=9)
		thousands = str[th] + " thousand ";
		
		if(h>=1 && h<=9)
		hundreds = str[(n%1000)/100]+ " hundred ";
		
		int x= (n%100);
		if(x>=20) {
			ten = tens[t];
		}
		else if(x<=19 && x>=10) {
			ten = lt[x%10];
		}
		
		int z = x/10;
		if(z==1)
			ones="";
		else
			ones = str[o];
		
		String res = thousands+hundreds+ten+ones;
		System.out.println(res);
	}

}
