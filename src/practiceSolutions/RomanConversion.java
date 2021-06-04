package practiceSolutions;

public class RomanConversion {

	public static void main(String[] args) {
		
		int n= 3568;
		
		  String m[]={"","M","MM","MMM","MMMM"};
		  String c[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		  String x[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		  String i[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		  
		  String thousands = m[n/1000];
		  String hundreds = c[(n%1000)/100];
		  String tens = x[(n%100)/10];
		  String ones = i[(n%10)];
		  
		  String str = thousands+hundreds+tens+ones;
		  System.out.println(str);;
		  
	    }

	}

