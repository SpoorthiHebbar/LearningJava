package practiceSolutions;

public class Denominations {

	public static void main(String[] args) {
		int[] a = {5,3};
		int n = 4;
		
		System.out.println(denom(a,a.length,n));

	}
	public static int denom(int[] a,int m,int n) {
		if(m<=0&&n>=1)
			return 0;
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		return denom(a,m-1,n)+denom(a,m,n-a[m-1]);
//			if(n==0)
//				return 0;
//			int res = Integer.MAX_VALUE;
//			
//			for(int i=0;i<m;i++) {
//				if(a[i]<=n) {
//					int subres = denom(a,m,n-a[i]);
//				if(subres!=Integer.MAX_VALUE && subres+1<res ) {
//					res = subres+1;
//				}
//			}
//		}return res;
	}

}
