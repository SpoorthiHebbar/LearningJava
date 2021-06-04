package practiceSolutions;

public class FindNthPrime {

	public static void main(String[] args) {
		
		System.out.println(findPrime(6));
	}
	public static int findPrime(int n) {
		int c=0,num=1,i;
		while(c<n) {
			num++;
			for(i=2;i<=num;i++) {
				if(num%i==0)
					break;
			}if(num==i)
				c++;
		}
		return num;
	}

}
